package com.netcenter.zaascy.service.impl;

import com.netcenter.zaascy.bean.Trade;
import com.netcenter.zaascy.dao.TradeMapper;
import com.netcenter.zaascy.service.TradeService;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/16.
 */
@Service(value="tradeService")
public class TradeServiceImpl implements TradeService,Serializable {

    @Resource(name="tradeDao")
    private TradeMapper dao;

    public int insertSelective(Trade trade) {
        return dao.insertSelective(trade);
    }
}
