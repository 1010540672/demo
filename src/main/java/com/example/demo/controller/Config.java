package com.example.demo.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hyt on 2018/10/10.
 */
@Component
//@EnableConfigurationProperties(value= {Config.class})
@ConfigurationProperties(prefix="config")
@Data
public class Config {
    String code;
    String name;
    List<String> hobby;
}
