package com.mars.system.controller;


import com.mars.common.core.utils.poi.ExcelUtil;
import com.mars.common.core.web.controller.BaseController;
import com.mars.common.core.web.domain.AjaxResult;
import com.mars.common.core.web.page.TableDataInfo;
import com.mars.common.log.annotation.Log;
import com.mars.common.log.enums.BusinessType;
import com.mars.common.security.annotation.InnerAuth;
import com.mars.common.security.annotation.PreAuthorize;
import com.mars.system.api.domain.SysLogininfor;
import com.mars.system.service.ISysLogininforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * 系统访问记录
 *
 * @author mars
 */
@RestController
@RequestMapping("/logininfor")
public class SysLogininforController extends BaseController
{

    @Autowired
    private ISysLogininforService logininforService;

    @PreAuthorize(hasPermi = "system:logininfor:list")
    @GetMapping("/list")
    public TableDataInfo list(SysLogininfor logininfor)
    {
        startPage();
        List<SysLogininfor> list = logininforService.selectLogininforList(logininfor);
        return getDataTable(list);
    }

    @Log(title = "登录日志", businessType = BusinessType.EXPORT)
    @PreAuthorize(hasPermi = "system:logininfor:export")
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysLogininfor logininfor) throws IOException
    {
        List<SysLogininfor> list = logininforService.selectLogininforList(logininfor);
        ExcelUtil<SysLogininfor> util = new ExcelUtil<SysLogininfor>(SysLogininfor.class);
        util.exportExcel(response, list, "登录日志");
    }

    @PreAuthorize(hasPermi = "system:logininfor:remove")
    @Log(title = "登录日志", businessType = BusinessType.DELETE)
    @DeleteMapping("/{infoIds}")
    public AjaxResult remove(@PathVariable Long[] infoIds)
    {
        return toAjax(logininforService.deleteLogininforByIds(infoIds));
    }

    @PreAuthorize(hasPermi = "system:logininfor:remove")
    @Log(title = "登录日志", businessType = BusinessType.DELETE)
    @DeleteMapping("/clean")
    public AjaxResult clean()
    {
        logininforService.cleanLogininfor();
        return AjaxResult.success();
    }

    @InnerAuth
    @PostMapping
    public AjaxResult add(@RequestBody SysLogininfor logininfor)
    {
        return toAjax(logininforService.insertLogininfor(logininfor));
    }
}
