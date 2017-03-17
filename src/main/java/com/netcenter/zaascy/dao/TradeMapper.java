package com.netcenter.zaascy.dao;

import com.netcenter.zaascy.bean.Trade;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("tradeDao")
public interface TradeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Trade record);

    int insertSelective(Trade record);

    Trade selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);

    List<Trade> selectAll();
}