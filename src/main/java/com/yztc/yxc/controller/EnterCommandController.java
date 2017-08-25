package com.yztc.yxc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
 public class EnterCommandController {
    @RequestMapping(value = "/yztcadmin123456.do",method = RequestMethod.GET)
    public String enter(){
        return "login";
    }

}