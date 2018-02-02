package com.cn21.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by linxw on 2018/2/2.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @ResponseBody
    @RequestMapping("/index")
    public String hello() {
        return "hello";
    }
}
