package com.xiaozu.tsport.operate.exception.user;

import com.xiaozu.tsport.operate.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author xiaozu
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
