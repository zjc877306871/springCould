package com.zhang.controller;

import com.zhang.entity.User;
import com.zhang.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YJ on 2018/1/24.
 */

@RestController
public class HelloController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User queryUserInfo(@PathVariable String id){
        User user = userFeignClient.queryUserInfo(id);
        return user;
    }

    @GetMapping("/getUserSuccesee")
    public User getUser(User user){
        return  userFeignClient.getUserSuccesee(user.getUserId(),user.getUserName());
    }



}
