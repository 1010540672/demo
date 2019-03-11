package com.example.demo.biz.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.biz.dao.UserDao;
import com.example.demo.biz.entity.User;
import com.example.demo.biz.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author oKong
 * @since 2018-07-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
