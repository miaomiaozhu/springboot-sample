package com.example.sample.user.mapper;

import java.util.List;
import com.example.sample.user.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 用戶Mapper接口
 * 
 * @author Jumy
 * @date 2020-10-02
 */
@Mapper
@Repository
public interface UserMapper 
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
     * 修改用戶
     * 
     * @param user 用戶
     * @return 结果
     */
    public int updateUser(User user);

    /**
     * 删除用戶
     * 
     * @param userId 用戶ID
     * @return 结果
     */
    public int deleteUserById(String userId);

    /**
     * 批量删除用戶
     * 
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserByIds(String[] userIds);

    /**
     * 批量添加用戶
     *
     * @param userList 需要添加的数据
     * @return 结果
     */
    public int batchInsertUser(List<User> userList);
}
