package xyz._18181010.boot_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import xyz._18181010.boot_demo.common.BaseClass;
import xyz._18181010.boot_demo.common.CustomClass;

@Configuration
public class CustomClassConfig {

    @Bean
    public BaseClass customClass(){
        return new CustomClass();
    }
}
