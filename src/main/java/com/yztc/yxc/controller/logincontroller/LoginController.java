package com.yztc.yxc.controller.logincontroller;


import com.yztc.yxc.commons.MD5Tools;
import com.yztc.yxc.entity.admin.User;
import com.yztc.yxc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService service;

    @RequestMapping(value = "/loginUser1",method = RequestMethod.POST)
    public String loginUser(User user , HttpSession httpSession){
        String username= MD5Tools.MD5(user.getUsername());
        String password=MD5Tools.MD5(user.getPassword());

        User new_user=new User();
        new_user.setUsername(username);
        new_user.setPassword(password);
        boolean flag=service.findLogin(new_user);
        if(flag==true){
            httpSession.setAttribute("user" ,user);
            return "forward:index";
        }

        return "index";

    }
}
