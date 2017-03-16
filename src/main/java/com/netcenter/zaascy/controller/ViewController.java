package com.netcenter.zaascy.controller;

import com.netcenter.zaascy.bean.Trade;
import com.netcenter.zaascy.dao.TradeMapper;
import com.netcenter.zaascy.service.TradeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/3/15.
 */
@Controller
@RequestMapping("/userController")
public class ViewController {

    private static Log log = LogFactory.getLog(ViewController.class);
    @Resource(name = "tradeService")
    private TradeService tradeService;

    @RequestMapping(value={"/view"})
    public ModelAndView handleRequest(@RequestParam("test")String test, Trade trade){
        ModelAndView mav = new ModelAndView();
        log.info(test);
        Integer id = tradeService.insertSelective(trade);
        //id一直显示为1  这明显是错误的 不是应该返回id吗
        log.info("id为："+id);
        //这个是返回的id
        Long ids = trade.getId();
        log.info("ids为："+ids);

        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value={"/edit"})
    public ModelAndView handleRequest(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("trade_edit");
        return mav;
    }


}
