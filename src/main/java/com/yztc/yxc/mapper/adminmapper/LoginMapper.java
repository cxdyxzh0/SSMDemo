package com.yztc.yxc.mapper.adminmapper;


import com.yztc.yxc.entity.admin.User;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

    public User findLogin(User user);

}
