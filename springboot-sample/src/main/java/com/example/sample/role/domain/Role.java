package com.example.sample.role.domain;

import java.util.Date;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 角色对象 test_role
 * 
 * @author Jumy
 * @date 2020-10-04
 */
@Data
public class Role extends BaseRowModel
{
    private static final long serialVersionUID = 1L;
    /** 角色ID */
    @ApiModelProperty("角色ID")
    @ExcelProperty(value = "角色ID", index = 0)
    private String roleId;
    /** 角色名称 */
    @ApiModelProperty("角色名称")
    @ExcelProperty(value = "角色名称", index = 1)
    private String roleName;
    /** 创建人 */
    @ApiModelProperty("创建人")
    @ExcelProperty(value = "创建人", index = 2)
    private String createBy;
    /** 创建时间 */
    @ApiModelProperty("创建时间")
    @ExcelProperty(value = "创建时间", index = 3)
    private Date createTime;
    /** 更新人 */
    @ApiModelProperty("更新人")
    @ExcelProperty(value = "更新人", index = 4)
    private String updateBy;
    /** 更新时间 */
    @ApiModelProperty("更新时间")
    @ExcelProperty(value = "更新时间", index = 5)
    private Date updateTime;
}
