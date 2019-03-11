package com.example.demo.biz.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by hyt on 2018/10/22.
 *
 *
 * CREATE TABLE `person` (
 `id` bigint(20) NOT NULL,
 `age` int(11) DEFAULT NULL,
 `descyqq` varchar(1000) DEFAULT NULL,
 `name` varchar(200) DEFAULT NULL,
 PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

 */
@Data
@Accessors(chain = true)
public class Person extends Model<Person> {


    @TableId
    public Long id;
    public String name;
    public  String descyqq;
    public int age;


    @Override
    protected Serializable pkVal() {
        return id;
    }
}
