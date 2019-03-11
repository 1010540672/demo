package com.example.demo.biz.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.example.demo.biz.entity.Person;
import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2018/10/22.
 */
public interface PersonDao extends BaseMapper<Person> {

}
