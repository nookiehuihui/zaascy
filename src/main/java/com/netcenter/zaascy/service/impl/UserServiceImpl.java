package com.netcenter.zaascy.service.impl;

import com.netcenter.zaascy.bean.User;
import com.netcenter.zaascy.dao.UserMapper;
import com.netcenter.zaascy.service.UserService;
import com.netcenter.zaascy.util.SecurityUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/3/20.
 */
@Service(value="userService")
public class UserServiceImpl implements UserService{
    @Resource(name = "userDao")
    private UserMapper dao;

    public Boolean usernameVerify(String username) {
        Integer isShow = dao.selectByUsername(username);
        if(isShow==1){
            return true;
        }else{
            return false;
        }
   }

    public Boolean loginVerify(String username, String password) {
        String password_s = dao.findPasswordByLoginname(username);
        try {
            return SecurityUtil.encryptMessage(password).equals(password_s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
