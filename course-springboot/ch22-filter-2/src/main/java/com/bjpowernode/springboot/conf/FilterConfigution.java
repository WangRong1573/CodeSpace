package com.bjpowernode.springboot.conf;

import com.bjpowernode.springboot.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/5/26
 **/

@Configuration
public class FilterConfigution implements WebMvcConfigurer {
    @Bean
    public FilterRegistrationBean myFilterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/test");
        return filterRegistrationBean;
    }
}
