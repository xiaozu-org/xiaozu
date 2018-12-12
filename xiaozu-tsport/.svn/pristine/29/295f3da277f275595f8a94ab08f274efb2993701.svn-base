package com.xiaozu.tsport.interfaces.framework.shiro.service;

import com.xiaozu.tsport.domain.system.SysUser;

/**
 * 登录密码方法
 * 
 * @author xiaozu
 */
public interface SysPasswordService
{
    public void validate(SysUser user, String password);

    public boolean matches(SysUser user, String newPassword);

    public void clearLoginRecordCache(String username);

    public String encryptPassword(String username, String password, String salt);

}
