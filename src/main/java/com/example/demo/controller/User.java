package com.example.demo.controller;

import lombok.*;
import lombok.Value;
import org.springframework.beans.factory.annotation.*;

/**
 * Created by hyt on 2018/10/9.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
   // @Value("${my_yqq.name}")
    private String name;
  //  @Value("${myyqq.age}")
    protected int age;


}
