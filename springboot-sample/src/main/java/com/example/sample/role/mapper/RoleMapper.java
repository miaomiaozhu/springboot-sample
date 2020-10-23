package com.example.sample.role.mapper;

import com.example.sample.role.domain.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色Mapper接口
 * 
 * @author Jumy
 * @date 2020-10-04
 */
@Mapper
@Repository
public interface RoleMapper 
{
    /**
     * 查询角色
     * 
     * @param roleId 角色ID
     * @return 角色
     */
    public Role selectRoleById(String roleId);

    /**
     * 查询角色列表
     * 
     * @param role 角色
     * @return 角色集合
     */
    public List<Role> selectRoleList(Role role);

    /**
     * 新增角色
     * 
     * @param role 角色
     * @return 结果
     */
    public int insertRole(Role role);
    /**
     * 批量新增角色
     *
     * @param roleList
     * @return 结果
     */
    public int batchInsertRole(List<Role> roleList);
    /**
     * 修改角色
     * 
     * @param role 角色
     * @return 结果
     */
    public int updateRole(Role role);

    /**
     * 删除角色
     * 
     * @param roleId 角色ID
     * @return 结果
     */
    public int deleteRoleById(String roleId);

    /**
     * 批量删除角色
     * 
     * @param roleIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteRoleByIds(String[] roleIds);
}
