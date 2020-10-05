package com.example.sample.user.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import com.ruoyi.common.annotation.Excel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 用戶对象 test_user
 *
 * @author Jumy
 * @date 2020-10-02
 */
@Data
public class User extends BaseRowModel
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @ApiModelProperty("主键")
    private String userId;

    /** 姓名 */
    @ApiModelProperty("姓名")
    @ExcelProperty(value = "姓名", index = 0)
    private String userName;

    /** 年龄 */
    @ApiModelProperty("年龄")
    @ExcelProperty(value = "年龄", index = 1)
    private Long age;

    /** 出生日期 */
    @ApiModelProperty("出生日期")
    @ExcelProperty(value = "出生日期", index = 2)
    private String birthDate;

    /** 籍贯 */
    @ApiModelProperty("籍贯")
    @ExcelProperty(value = "籍贯", index = 3)
    private String nativePlace;

    /** 身份证号 */
    @ApiModelProperty("身份证号")
    @ExcelProperty(value = "身份证号", index = 4)
    private String idNumber;

    /** 备注 */
    @ApiModelProperty("备注")
//    @ExcelProperty(value = "备注", index = 5)
    private String remark;

    @ApiModelProperty("创建人")
    @ExcelProperty(value = "创建人", index = 5)
    private String createBy;

    @ApiModelProperty("创建时间")
    @ExcelProperty(value = "创建时间", index = 6,format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty("更新人")
    @ExcelProperty(value = "更新人", index = 7)
    private String updateBy;

    @ApiModelProperty("更新时间")
    @ExcelProperty(value = "更新时间", index = 8,format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

}
