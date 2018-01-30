package com.zhang.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 方式一:增加ribbon自定义路由规则，目录路径必须在主main方法所在包之外的路径，
 * 否则兹定于路由规则全覆盖所有的application的规则，不能进行指定application进行自定义路由规则
 * 方式二:添加excludeFromComponentScan注解类，并在主main函数上添加
 * @ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExcludeFromComponentScan.class)})
 * Created by YJ on 2018/1/29.
 */
@Configuration
@ExcludeFromComponentScan
public class TestRibbonConfig {

    @Bean
    public IRule ribbonIRule(){
        System.out.println("随机的。。。。");
        return new RandomRule();
    }
}
