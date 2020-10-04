package com.example.sample.role.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sample.role.mapper.RoleMapper;
import com.example.sample.role.domain.Role;
import com.example.sample.role.service.IRoleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 角色Service业务层处理
 * 
 * @author Jumy
 * @date 2020-10-04
 */
@Service
public class RoleServiceImpl implements IRoleService 
{
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 查询角色
     * 
     * @param roleId 角色ID
     * @return 角色
     */
    @Override
    public Role selectRoleById(String roleId)
    {
        return roleMapper.selectRoleById(roleId);
    }

    /**
     * 查询角色列表
     * 
     * @param role 角色
     * @return 角色
     */
    @Override
    public List<Role> selectRoleList(Role role)
    {
        return roleMapper.selectRoleList(role);
    }

    /**
     * 新增角色
     * 
     * @param role 角色
     * @return 结果
     */
    @Override
    public int insertRole(Role role)
    {
        role.setCreateTime(DateUtils.getNowDate());
        return roleMapper.insertRole(role);
    }

    /**
     * 批量新增角色
     *
     * @param roleList
     * @return 结果
     */
    @Override
    public int batchInsertRole(List<Role> roleList) {
        //TODO 校验数据有效性
        return roleMapper.batchInsertRole(roleList);
    }
    /**
     * 修改角色
     *
     * @param role 角色
     * @return 结果
     */
    @Override
    public int updateRole(Role role)
    {
        role.setUpdateTime(DateUtils.getNowDate());
        return roleMapper.updateRole(role);
    }

    /**
     * 删除角色对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRoleByIds(String ids)
    {
        return roleMapper.deleteRoleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除角色信息
     * 
     * @param roleId 角色ID
     * @return 结果
     */
    @Override
    public int deleteRoleById(String roleId)
    {
        return roleMapper.deleteRoleById(roleId);
    }
}
