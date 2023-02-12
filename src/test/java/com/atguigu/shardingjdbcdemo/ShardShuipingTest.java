package com.atguigu.shardingjdbcdemo;

import com.atguigu.shardingjdbcdemo.entity.Order;
import com.atguigu.shardingjdbcdemo.entity.User;
import com.atguigu.shardingjdbcdemo.mapper.OrderMapper;
import com.atguigu.shardingjdbcdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.OS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

/**
 * @author: atguigu
 * @create: 2023-02-11 14:44
 */
@SpringBootTest
@SuppressWarnings("all")
public class ShardShuipingTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;


    @Test
    public void testInserUser(){
        User user = new User();
        user.setName("小明");
        userMapper.insert(user);
    }

    @Test
    public void testQueryUser(){
        userMapper.selectList(null);
    }




    @Test
    public void testInserOrder(){
        Order order = new Order();
        order.setOrderNo("ATGUIGU001");
        order.setAmount(new BigDecimal("100"));
        order.setUserId(1L);
        orderMapper.insert(order);
    }

    @Test
    public void testQueryORder(){
        orderMapper.selectList(null);
    }



}
