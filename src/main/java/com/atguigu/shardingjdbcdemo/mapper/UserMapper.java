package com.atguigu.shardingjdbcdemo.mapper;

import com.atguigu.shardingjdbcdemo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

//@Mapper  //方式一：产生持久层代理对象
public interface UserMapper extends BaseMapper<User> {
}
