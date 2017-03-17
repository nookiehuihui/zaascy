package com.netcenter.zaascy.dao;

import com.netcenter.zaascy.bean.Depart;
import java.math.BigDecimal;

public interface DepartMapper {
    int deleteByPrimaryKey(BigDecimal danwId);

    int insert(Depart record);

    int insertSelective(Depart record);

    Depart selectByPrimaryKey(BigDecimal danwId);

    int updateByPrimaryKeySelective(Depart record);

    int updateByPrimaryKey(Depart record);
}