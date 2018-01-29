package config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * 增加ribbon自定义路由规则，目录路径必须在主main方法所在包之外的路径，
 * 否则兹定于路由规则全覆盖所有的application的规则，不能进行指定application进行自定义路由规则
 * Created by YJ on 2018/1/29.
 */
@Configuration
public class TestRibbonConfig {

    @Autowired(required = false)
    private IClientConfig clientConfig;

    public IRule ribbonIRule(IClientConfig clientConfig){
        System.out.println("随机的。。。。");
        return new RandomRule();
    }
}
