package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by hyt on 2018/10/15.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RootData {
    private Animals animals;
}
