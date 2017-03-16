package com.netcenter.zaascy.service;

import com.netcenter.zaascy.bean.Trade;


/**
 * Created by Administrator on 2017/3/16.
 */
public interface TradeService {
    /**
     * insert trade
     * @param trade
     * @return insert id
     */
    int insertSelective(Trade trade);
}
