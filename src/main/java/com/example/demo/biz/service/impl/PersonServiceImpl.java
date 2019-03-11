package com.example.demo.biz.service.impl;

import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.biz.dao.PersonDao;
import com.example.demo.biz.entity.Person;
import com.example.demo.biz.service.IPersonService;
import com.example.demo.biz.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by hyt on 2018/10/22.
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonDao,Person> implements IPersonService {



}
