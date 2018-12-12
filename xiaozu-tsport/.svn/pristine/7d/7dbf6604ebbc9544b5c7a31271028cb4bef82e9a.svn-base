package com.xiaozu.tsport.framework.web.service.impl;

import com.xiaozu.tsport.interfaces.framework.web.service.PermissionService;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;

/**
 * xiaozu首创 js调用 thymeleaf 实现按钮权限可见性
 * 
 * @author xiaozu
 */
@Service("permission")
public class PermissionServiceImpl implements PermissionService
{
    @Override
    public String hasPermi(String permission)
    {
        return isPermittedOperator(permission) ? "" : "hidden";
    }

    private boolean isPermittedOperator(String permission)
    {
        return SecurityUtils.getSubject().isPermitted(permission);
    }
}
