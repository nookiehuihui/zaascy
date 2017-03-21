package com.netcenter.zaascy.dao;

import com.netcenter.zaascy.bean.LoginToken;

public interface LoginTokenMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoginToken record);

    int insertSelective(LoginToken record);

    LoginToken selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginToken record);

    int updateByPrimaryKey(LoginToken record);
}