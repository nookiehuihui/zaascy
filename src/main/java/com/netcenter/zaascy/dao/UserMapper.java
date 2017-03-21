package com.netcenter.zaascy.dao;

import com.netcenter.zaascy.bean.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Repository("userDao")
public interface UserMapper {
    int deleteByPrimaryKey(BigDecimal yonghId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(BigDecimal yonghId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    Integer selectByUsername(String username);

    String findPasswordByLoginname(String username);
}