package com.example.sample.role.controller;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.example.sample.easyexcel.RoleExcelListener;
import com.example.sample.role.domain.Role;
import com.example.sample.role.service.IRoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * 角色Controller
 * 
 * @author Jumy
 * @date 2020-10-04
 */
@Controller
@RequestMapping("/sample/role")
@Api(description = "角色controller")
public class RoleController extends BaseController
{

    @Autowired
    private IRoleService roleService;


    /**
     * 查询角色列表
     */
    @ApiOperation(value="查询角色列表",notes = "查询角色列表")
    @RequiresPermissions("sample:role:list")
    @GetMapping("/list")
    @ResponseBody
    public PageInfo<Role> list(@ApiParam(value = "当前页")@RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum, @ApiParam(value = "每页条数")@RequestParam(defaultValue = "10", value = "pageSize") Integer pageSize,Role role)
    {
        PageHelper.startPage(pageNum,pageSize);
        List<Role> list = roleService.selectRoleList(role);
        PageInfo<Role> pageInfo = new PageInfo<Role>(list);
        return pageInfo;
    }
    /**
     * 查询角色详情
     */
    @ApiOperation(value="查询角色详情",notes = "查询角色详情")
    @RequiresPermissions("sample:role:detail")
    @GetMapping("/detail")
    @ResponseBody
    public AjaxResult roleDetail(@RequestParam(value="id")@ApiParam(value="id") String id)
    {
        Role role = roleService.selectRoleById(id);
        return AjaxResult.success(role);
    }
    /**
     * 导出角色列表
     */
    @ApiOperation(value="导出角色列表",notes = "导出角色列表")
    @RequiresPermissions("sample:role:export")
    @Log(title = "角色", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    @ResponseBody
    public AjaxResult export(Role role)
    {
        List<Role> list = roleService.selectRoleList(role);
        ExcelUtil<Role> util = new ExcelUtil<Role>(Role.class);
        return util.exportExcel(list, "role");
    }

    /**
     * 新增角色
     */
    @ApiOperation(value="新增角色",notes = "新增角色")
    @RequiresPermissions("sample:role:add")
    @Log(title = "角色", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody Role role)
    {
        return toAjax(roleService.insertRole(role));
    }
    /**
     * 修改角色
     */
    @ApiOperation(value="修改角色",notes = "修改角色")
    @RequiresPermissions("sample:role:edit")
    @Log(title = "角色", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@RequestBody Role role)
    {
        return toAjax(roleService.updateRole(role));
    }

    /**
     * 删除角色
     */
    @ApiOperation(value="删除角色",notes = "删除角色")
    @RequiresPermissions("sample:role:remove")
    @Log(title = "角色", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(@RequestParam(value="ids",required = true)@ApiParam(value ="角色ID" )String ids)
    {
        return toAjax(roleService.deleteRoleByIds(ids));
    }

    /**
    * 导入角色列表
    */
    @ApiOperation(value="导入角色列表",notes = "导入角色列表")
    @RequiresPermissions("/:role:import")
    @Log(title = "角色", businessType = BusinessType.EXPORT)
    @PostMapping("/importRole")
    @ResponseBody
    public AjaxResult importRole(@RequestParam MultipartFile file) {

        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //实例化实现了AnalysisEventListener接口的类
        RoleExcelListener listener = new RoleExcelListener();
        //传入参数
        ExcelReader excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLSX, null, listener);
        //读取信息
        excelReader.read(new Sheet(1, 1, Role.class));
        //获取数据
        List<Object> list = listener.getDatas();
        Object ob = (Object) list;
        List<Role> listRole = (List<Role>)ob ;
        //批量插入
        roleService.batchInsertRole(listRole);
        return AjaxResult.success();
    }
    /**
     * 导出角色列表
     */
    @ApiOperation(value="导出角色列表",notes = "导出角色列表")
    @RequiresPermissions("/:role:export")
    @Log(title = "角色", businessType = BusinessType.EXPORT)
    @GetMapping("/roleExport")
    @ResponseBody
    public String roleExport(HttpServletResponse response,Role role) throws Exception { //throws IOException {
        ExcelWriter writer = null;
        OutputStream outputStream = response.getOutputStream();
        try {
            String filename= DateUtils.dateTimeNow()+"role.xls";
            //添加响应头信息
            response.setHeader("Content-disposition", "attachment; filename=" + filename);
            //设置类型
            response.setContentType("application/msexcel;charset=UTF-8");
            //设置头
            response.setHeader("Pragma", "No-cache");
            //设置头
            response.setHeader("Cache-Control", "no-cache");
            //设置日期头
            response.setDateHeader("Expires", 0);

            //实例化 ExcelWriter
            writer = new ExcelWriter(outputStream, ExcelTypeEnum.XLSX, true);
            //实例化表单
            Sheet sheet = new Sheet(1, 0, Role.class);
            sheet.setSheetName("角色列表");
            //获取数据
            List<Role> list = roleService.selectRoleList(role);
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
        return null;
    }
}
