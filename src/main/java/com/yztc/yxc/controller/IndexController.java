package com.yztc.yxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/login")
public class IndexController {
    @RequestMapping("/list1.do")
    public String list(){

        return "list";
    }

    @RequestMapping( value = "/add.do" )
    public String add() {
        return "add_product";
    }
}
