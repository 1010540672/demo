package com.example.demo.controller;


import com.example.demo.biz.entity.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResp {
	String id;
	
	String code;
	
	String name;
	
	StatusEnum status;

}
