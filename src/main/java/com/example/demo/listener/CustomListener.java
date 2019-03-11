package com.example.demo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;

import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by hyt on 2018/10/15.
 */
@Slf4j
@WebListener
public class CustomListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.debug("=======requestDestroyed============");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.debug("=======requestInitialized============");
    }
}
