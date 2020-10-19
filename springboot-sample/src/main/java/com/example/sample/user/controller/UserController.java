package com.example.sample.user.controller;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.example.sample.easyexcel.UserExcelListener;
import com.example.sample.user.domain.User;
import com.example.sample.user.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.DateUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 用戶Controller
 * 
 * @author Jumy
 * @date 2020-10-02
 */
@RestController
@RequestMapping("/user")
@Api(description = "用户controller")
public class UserController extends BaseController
{

    @Autowired
    private IUserService userService;

    /**
     * 查询用戶列表
     */
    @RequiresPermissions("/:user:list")
    @GetMapping("/userList")
    @ResponseBody
    @ApiOperation(value="查询用戶列表",notes = "查询用戶列表")
    public PageInfo<User> userList(@ApiParam(value = "当前页")@RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum, @ApiParam(value = "每页条数")@RequestParam(defaultValue = "10", value = "pageSize") Integer pageSize,User user)
    {
        PageHelper.startPage(pageNum,pageSize);
        List<User> list = userService.selectUserList(user);
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        return pageInfo;
    }
    /**
     * 查询用戶详情
     */
    @RequiresPermissions("/:user:detail")
    @GetMapping("/userDetail")
    @ResponseBody
    @ApiOperation(value="查询用戶详情",notes = "查询用戶详情")
    public AjaxResult userDetail(@RequestParam(value="id")@ApiParam(value="用户id") String id)
    {
        User user = userService.selectUserById(id);
        return AjaxResult.success(user);
    }


    /**
     * 新增保存用戶
     */
    @RequiresPermissions("/:user:add")
    @Log(title = "用戶", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    @ApiOperation(value="新增保存用戶",notes = "导出用戶列表")
    public AjaxResult addUser(@RequestBody User user)
    {
        return toAjax(userService.insertUser(user));
    }

    /**
     * 修改保存用戶
     */
    @RequiresPermissions("/:user:edit")
    @Log(title = "用戶", businessType = BusinessType.UPDATE)
    @PostMapping("/updateUser")
    @ResponseBody
    @ApiOperation(value="修改保存用戶",notes = "修改保存用戶")
    public AjaxResult updateUser(@RequestBody User user)
    {
        return toAjax(userService.updateUser(user));
    }

    /**
     * 删除用戶
     */
    @RequiresPermissions("/:user:remove")
    @Log(title = "用戶", businessType = BusinessType.DELETE)
    @PostMapping( "/removeUser")
    @ResponseBody
    @ApiOperation(value="删除用戶",notes = "删除用戶")
    public AjaxResult removeUser(@RequestParam(value="ids")@ApiParam(value="用户ids") String ids)
    {
        return toAjax(userService.deleteUserByIds(ids));
    }
    /**
     * 导入用戶列表
     */
    @RequiresPermissions("/:user:import")
    @Log(title = "用戶", businessType = BusinessType.EXPORT)
    @PostMapping("/importUser")
    @ResponseBody
    @ApiOperation(value="导入用戶列表",notes = "导入用戶列表")
    public AjaxResult importUser(@RequestParam MultipartFile file) {
        long start_time = System.currentTimeMillis();
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //实例化实现了AnalysisEventListener接口的类
        UserExcelListener listener = new UserExcelListener(userService);
        //传入参数
        ExcelReader excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLSX, null, listener);
        //读取信息
        excelReader.read(new Sheet(1, 1, User.class));
//        //获取数据
//        List<User> list = listener.getDatas();
//        Object ob = (Object) list;
//        List<User> listUser = (List<User>)ob ;
//        //批量插入
//        userService.batchInsertUser(listUser);
        long end_time = System.currentTimeMillis();
        System.out.println("cost time by seconds->"+(end_time-start_time)/1000+"s");
        return AjaxResult.success();
    }
    /**
     * 导出用戶列表
     */
    @RequiresPermissions("/:user:export")
    @Log(title = "用戶", businessType = BusinessType.EXPORT)
    @GetMapping("/userExport")
    @ResponseBody
    @ApiOperation(value="导出用戶列表",notes = "导出用戶列表")
    public void userExport(HttpServletResponse response,User user) throws Exception { //throws IOException {
        ExcelWriter writer = null;
        OutputStream outputStream = response.getOutputStream();
        try {
            String filename= DateUtils.dateTimeNow()+"user.xls";
            //添加响应头信息
            response.setHeader("Content-disposition", "attachment; filename=" + filename);
            response.setContentType("application/msexcel;charset=UTF-8");//设置类型
            response.setHeader("Pragma", "No-cache");//设置头
            response.setHeader("Cache-Control", "no-cache");//设置头
            response.setDateHeader("Expires", 0);//设置日期头

            //实例化 ExcelWriter
            writer = new ExcelWriter(outputStream, ExcelTypeEnum.XLSX, true);
            //实例化表单
            Sheet sheet = new Sheet(1, 0, User.class);
            sheet.setSheetName("用戶列表");
            //获取数据
            List<User> list = userService.selectUserList(user);
            //输出
            writer.write(list, sheet);
            writer.finish();
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                response.getOutputStream().close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
