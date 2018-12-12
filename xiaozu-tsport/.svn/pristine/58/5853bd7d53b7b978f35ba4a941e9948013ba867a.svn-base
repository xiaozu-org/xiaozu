package com.xiaozu.tsport.interfaces.framework.web.service;

import com.xiaozu.tsport.domain.system.SysDictData;

import java.util.List;

/**
 * xiaozu首创 html调用 thymeleaf 实现字典读取
 * 
 * @author xiaozu
 */
public interface DictService
{

    /**
     * 根据字典类型查询字典数据信息
     * 
     * @param dictType 字典类型
     * @return 参数键值
     */
    public List<SysDictData> getType(String dictType);

    /**
     * 根据字典类型和字典键值查询字典数据信息
     * 
     * @param dictType 字典类型
     * @param dictValue 字典键值
     * @return 字典标签
     */
    public String getLabel(String dictType, String dictValue);
}
