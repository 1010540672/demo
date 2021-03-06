package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by hyt on 2018/10/15.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dog {

    private String name;

    private String breed;

    private int count;

    private boolean twoFeet;
}
