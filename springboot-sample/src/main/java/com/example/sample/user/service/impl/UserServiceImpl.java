package com.example.sample.user.service.impl;

import java.util.List;

import com.example.sample.user.mapper.UserMapper;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sample.user.domain.User;
import com.example.sample.user.service.IUserService;
import com.ruoyi.common.core.text.Convert;

/**
 * 用戶Service业务层处理
 * 
 * @author Jumy
 * @date 2020-10-02
 */
@Service
public class UserServiceImpl implements IUserService
{
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询用戶
     * 
     * @param userId 用戶ID
     * @return 用戶
     */
    @Override
    public User selectUserById(String userId)
    {
        return userMapper.selectUserById(userId);
    }

    /**
     * 查询用戶列表
     *
     * @param user 用戶
     * @return 用戶
     */
    @Override
    public List<User> selectUserList(User user)
    {
        return userMapper.selectUserList(user);
    }

    /**
     * 新增用戶
     *
     * @param user 用戶
     * @return 结果
     */
    @Override
    public int insertUser(User user)
    {
        //设置操作人信息 TODO
        user.setCreateTime(DateUtils.getNowDate());
        //唯一性校验 TODO
        //其他校验 TODO
        return userMapper.insertUser(user);
    }

    @Override
    public int batchInsertUser(List<User> userList) {
        //TODO 校验数据有效性
        return userMapper.batchInsertUser(userList);
    }

    /**
     * 修改用戶
     *
     * @param user 用戶
     * @return 结果
     */
    @Override
    public int updateUser(User user)
    {
        //设置更新人信息 TODO
        user.setUpdateTime(DateUtils.getNowDate());
        //唯一性校验 TODO
        //其他校验 TODO
        return userMapper.updateUser(user);
    }

    /**
     * 删除用戶对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteUserByIds(String ids)
    {
        return userMapper.deleteUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除用戶信息
     *
     * @param userId 用戶ID
     * @return 结果
     */
    @Override
    public int deleteUserById(String userId)
    {
        return userMapper.deleteUserById(userId);
    }
}
