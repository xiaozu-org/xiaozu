package com.xiaozu.tsport.system.service.impl;

import com.xiaozu.tsport.interfaces.framework.web.service.ConfigService;
import com.xiaozu.tsport.interfaces.system.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * xiaozu首创 html调用 thymeleaf 实现参数管理
 * 
 * @author xiaozu
 */
@Service("config")
public class ConfigServiceImpl implements ConfigService
{
    @Autowired
    private ISysConfigService configService;

    /**
     * 根据键名查询参数配置信息
     * 
     * @param configKey 参数名称
     * @return 参数键值
     */
    @Override
    public String getKey(String configKey)
    {
        return configService.selectConfigByKey(configKey);
    }
}
