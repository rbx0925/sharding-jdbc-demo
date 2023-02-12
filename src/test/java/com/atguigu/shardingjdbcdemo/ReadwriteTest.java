package com.atguigu.shardingjdbcdemo;

import com.atguigu.shardingjdbcdemo.entity.User;
import com.atguigu.shardingjdbcdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class ReadwriteTest {

    @Autowired
    private UserMapper userMapper;

    /**
     * 写入数据的测试
     */
    @Test
    @Transactional
    public void testInsert(){
        User user = new User();
        user.setName("张三丰");
        userMapper.insert(user);

        User user1 = userMapper.selectById(user.getId());
        System.out.println(user1);
    }


    /**
     * 写入数据的测试
     */
    @Test
    public void testQuery(){
        userMapper.selectList(null);
        userMapper.selectList(null);
        userMapper.selectList(null);
        userMapper.selectList(null);
        userMapper.selectList(null);
        userMapper.selectList(null);
        userMapper.selectList(null);
        userMapper.selectList(null);
        userMapper.selectList(null);
        userMapper.selectList(null);
        userMapper.selectList(null);
        userMapper.selectList(null);
    }

}
