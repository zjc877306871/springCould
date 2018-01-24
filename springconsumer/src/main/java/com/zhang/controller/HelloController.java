package com.zhang.controller;

import com.zhang.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by YJ on 2018/1/24.
 */

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    public User queryUserInfo(@PathVariable String id){
        User user = restTemplate.getForObject("",User.class);
        return user;
    }

}
