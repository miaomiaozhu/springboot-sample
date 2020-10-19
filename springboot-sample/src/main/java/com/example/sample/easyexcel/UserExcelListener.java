package com.example.sample.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.sample.user.domain.User;
import com.example.sample.user.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * EasyExcel 导入监听
 */
// 有个很重要的点 DemoDataListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
public class UserExcelListener extends AnalysisEventListener<User> {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserExcelListener.class);
    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 500;
    //可以通过实例获取该值
    private List<User> datas = new ArrayList<User>();
    private IUserService userService;
    /**
     * 如果使用了spring,请使用这个构造方法。每次创建Listener的时候需要把spring管理的类传进来
     *
     * @param userService
     */
    public UserExcelListener(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public void invoke(User user, AnalysisContext analysisContext) {
        datas.add(user);//数据存储到list，供批量处理，或后续自己业务逻辑处理。
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (datas.size() >= BATCH_COUNT) {
            saveData();
            // 存储完成清理 list
            datas.clear();
        }
    }
    /**
     * 加上存储数据库
     */
    private void saveData() {
        LOGGER.info("{}条数据，开始存储数据库！", datas.size());
        //批量插入
        userService.batchInsertUser(datas);
        LOGGER.info("存储数据库成功！");
    }

    public List<User> getDatas() {
        return datas;
    }

    public void setDatas(List<User> datas) {
        this.datas = datas;
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        saveData();
        datas.clear();//解析结束销毁不用的资源
        LOGGER.info("所有数据解析完成！");
    }
}
