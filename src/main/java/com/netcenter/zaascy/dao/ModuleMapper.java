package com.netcenter.zaascy.dao;

import com.netcenter.zaascy.bean.Module;
import java.math.BigDecimal;

public interface ModuleMapper {
    int deleteByPrimaryKey(BigDecimal mokId);

    int insert(Module record);

    int insertSelective(Module record);

    Module selectByPrimaryKey(BigDecimal mokId);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
}