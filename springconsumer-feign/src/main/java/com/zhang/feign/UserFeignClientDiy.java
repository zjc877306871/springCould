package com.zhang.feign;

import config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * feign暴露接口
 * Created by YJ on 2018/1/30.
 */
@FeignClient(name = "springprovider2", configuration = FeignConfig.class)
public interface UserFeignClientDiy {



}
