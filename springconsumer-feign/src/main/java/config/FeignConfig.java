package config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by YJ on 2018/1/30.
 */
@Configuration
public class FeignConfig {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
