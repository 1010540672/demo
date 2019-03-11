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
//@WebFilter(filterName="customFilter",urlPatterns={"/*"})
//@Order(1)//指定顺序升序
@Slf4j
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    log.error("============init===============111");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.error("============doFilter===============111");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        log.error("============destroy===============111");
    }
}
