package com.netcenter.zaascy.dao;

import com.netcenter.zaascy.bean.RoleRelationKey;

public interface RoleRelationMapper {
    int deleteByPrimaryKey(RoleRelationKey key);

    int insert(RoleRelationKey record);

    int insertSelective(RoleRelationKey record);
}