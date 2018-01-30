package com.zhang.feign;

import com.zhang.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * feign暴露接口
 * Created by YJ on 2018/1/30.
 */
@FeignClient("springprovider1")
public interface UserFeignClient {

    //只能用requestMapping ,不能用getMapping,,使用PathVariable的时候必须添加@PathVariable("id")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User queryUserInfo(@PathVariable("id") String id);

    //如果get请求，请求参数不能够是对象，即使制定了请求方法是get ,也不会成功
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser(User user);

    //如果get请求，多参数的正确方式-----不是最优的方式 ，只是可以成功
    @RequestMapping(value = "/getUserSuccesee", method = RequestMethod.GET)
    public User getUserSuccesee(@RequestParam("userId") long userId, @RequestParam("userName") String userName);

}
