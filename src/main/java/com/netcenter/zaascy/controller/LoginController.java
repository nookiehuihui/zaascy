package com.netcenter.zaascy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/3/20.
 */
@Controller
@RequestMapping("/userController")
public class LoginController {

    @RequestMapping(value={"/login"})
    public ModelAndView login(@RequestParam("token") String token){
        ModelAndView mav = new ModelAndView();
        return mav;
    }

}
