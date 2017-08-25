package com.yztc.yxc.service.impl;


import com.yztc.yxc.entity.admin.User;
import com.yztc.yxc.mapper.adminmapper.LoginMapper;
import com.yztc.yxc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("/LoginService")
public class LoginServiceImp implements LoginService {
    @Autowired
    private LoginMapper loginMapper;


    public boolean findLogin(User user) {
        User user1=loginMapper.findLogin(user);
        if(user1!=null){
            return true;
        }
        return false;

    }
}
