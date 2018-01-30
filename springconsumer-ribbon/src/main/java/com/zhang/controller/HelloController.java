package com.zhang.controller;

import com.zhang.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
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

//  ribbon  api调用入口
    @Autowired
    private LoadBalancerClient LoadBalancerClient;

    @GetMapping("/user/{id}")
    public User queryUserInfo(@PathVariable String id){
        ServiceInstance serviceInstance = LoadBalancerClient.choose("springprovider1");
        System.out.println("111"+serviceInstance.getHost()+":"+serviceInstance.getPort()+":"+serviceInstance.getServiceId());
        User user = restTemplate.getForObject("http://springprovider1/user/"+id,User.class);
        return user;
    }



}
