package com.zhang.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.zhang.entity.User;
import com.zhang.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YJ on 2018/1/22.
 */
@RestController
public class QueryUserInfo {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired(required = false)
    private EurekaClient clientlient;

    @GetMapping("/user/{id}")
    public User queryUserInfo(@PathVariable String id){
        User user =  userInfoService.queryUserInfo(id);
        System.out.println("userId="+user.getUserId());
        return user;
    }

    @GetMapping("/eureka")
    public String serviceUrl() {
        InstanceInfo instance = clientlient.getNextServerFromEureka("springprovider", false);
        return instance.getHomePageUrl();
    }
}
