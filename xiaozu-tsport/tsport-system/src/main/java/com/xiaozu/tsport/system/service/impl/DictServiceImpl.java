package com.xiaozu.tsport.system.service.impl;

import com.xiaozu.tsport.domain.system.SysDictData;
import com.xiaozu.tsport.interfaces.framework.web.service.DictService;
import com.xiaozu.tsport.interfaces.system.service.ISysDictDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * xiaozu首创 html调用 thymeleaf 实现字典读取
 * 
 * @author xiaozu
 */
@Service("dict")
public class DictServiceImpl implements DictService
{
    @Autowired
    private ISysDictDataService dictDataService;

    /**
     * 根据字典类型查询字典数据信息
     * 
     * @param dictType 字典类型
     * @return 参数键值
     */
    @Override
    public List<SysDictData> getType(String dictType)
    {
        return dictDataService.selectDictDataByType(dictType);
    }

    /**
     * 根据字典类型和字典键值查询字典数据信息
     * 
     * @param dictType 字典类型
     * @param dictValue 字典键值
     * @return 字典标签
     */
    @Override
    public String getLabel(String dictType, String dictValue)
    {
        return dictDataService.selectDictLabel(dictType, dictValue);
    }
}
