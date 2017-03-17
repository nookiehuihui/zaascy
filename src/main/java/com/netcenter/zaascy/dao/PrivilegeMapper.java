package com.netcenter.zaascy.dao;

import com.netcenter.zaascy.bean.Privilege;
import java.math.BigDecimal;

public interface PrivilegeMapper {
    int deleteByPrimaryKey(BigDecimal quanxId);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    Privilege selectByPrimaryKey(BigDecimal quanxId);

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKey(Privilege record);
}