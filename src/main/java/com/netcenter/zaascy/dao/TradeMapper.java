package com.netcenter.zaascy.dao;

import com.netcenter.zaascy.bean.Trade;
import org.springframework.stereotype.Repository;

@Repository("tradeDao")
public interface TradeMapper {
    int insert(Trade record);

    int insertSelective(Trade record);
}