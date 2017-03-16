package com.netcenter.zaascy.dao;

import com.netcenter.zaascy.bean.Trade;

public interface TradeMapper {
    int insert(Trade record);

    int insertSelective(Trade record);
}