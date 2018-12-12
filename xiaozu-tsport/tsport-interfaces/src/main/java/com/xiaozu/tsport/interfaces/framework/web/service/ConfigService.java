package com.xiaozu.tsport.interfaces.framework.web.service;

/**
 * xiaozu首创 html调用 thymeleaf 实现参数管理
 * 
 * @author xiaozu
 */
public interface ConfigService
{
    /**
     * 根据键名查询参数配置信息
     * 
     * @param configKey 参数名称
     * @return 参数键值
     */
    public String getKey(String configKey);
}
