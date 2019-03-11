package com.example.demo.filter;


import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by hyt on 2018/10/15.
 */
//注册器名称为customFilter,拦截的url为所有
//@WebFilter(filterName="customFilter2",urlPatterns={"/*"})
//@Order(2)
@Slf4j
public class CustomFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    log.error("============init===============222");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.error("============doFilter===============222");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        log.error("============destroy===============222");
    }
}
