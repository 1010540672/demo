package com.example.demo.config;

import com.example.demo.interceptor.CoustomInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by hyt on 2018/10/16.
 */
@Configuration
public class WebMvcConfigue extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器 拦截规则
        //多个拦截器时 以此添加 执行顺序按添加顺序【addPathPatterns("/*")一直拦截不到】？？？
        registry.addInterceptor(getHandlerInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Bean
    public static HandlerInterceptor getHandlerInterceptor() {
        return new CoustomInterceptor();
    }
}
