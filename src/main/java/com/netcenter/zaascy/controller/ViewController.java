package com.netcenter.zaascy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/15.
 */
@Controller
public class ViewController {
    @RequestMapping("/view")
    public String view(){
        System.out.println("你已通过springMVC进入controller方法。。。。");
        //怎么上传到github00000
        //第二步没有成功
        System.out.println("测试上传到github");
        return "index";
    }
}
