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
        //上传成功，没有添加公钥
        //第三步，Idea直接push成功
        System.out.println("push成功");
        return "index";
    }
}
