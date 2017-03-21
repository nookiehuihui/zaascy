package com.netcenter.zaascy.service;

/**
 * Created by Administrator on 2017/3/20.
 */
public interface UserService {

    Boolean usernameVerify(String username);

    Boolean loginVerify(String username, String password);
}
