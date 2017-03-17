package com.netcenter.zaascy.dao;

import com.netcenter.zaascy.bean.Role;
import java.math.BigDecimal;

public interface RoleMapper {
    int deleteByPrimaryKey(BigDecimal juesId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(BigDecimal juesId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}