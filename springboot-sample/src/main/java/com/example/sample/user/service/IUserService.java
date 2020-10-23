package com.example.sample.user.service;

import com.example.sample.user.domain.User;

import java.util.List;

/**
 * 用戶Service接口
 * 
 * @author Jumy
 * @date 2020-10-02
 */
public interface IUserService 
{
    /**
     * 查询用戶
     *
     * @param userId 用戶ID
     * @return 用戶
     */
    public User selectUserById(String userId);

    /**
     * 查询用戶列表
     *
     * @param user 用戶
     * @return 用戶集合
     */
    public List<User> selectUserList(User user);

    /**
     * 新增用戶
     *
     * @param user 用戶
     * @return 结果
     */
    public int insertUser(User user);

    /**
     * 批量新增用戶
     *
     * @param userList 用戶
     * @return 结果
     */
    public int batchInsertUser(List<User> userList);


    /**
     * 修改用戶
     *
     * @param user 用戶
     * @return 结果
     */
    public int updateUser(User user);

    /**
     * 批量删除用戶
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserByIds(String ids);

    /**
     * 删除用戶信息
     *
     * @param userId 用戶ID
     * @return 结果
     */
    public int deleteUserById(String userId);
}
