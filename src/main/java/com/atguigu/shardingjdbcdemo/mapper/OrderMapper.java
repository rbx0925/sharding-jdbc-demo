package com.atguigu.shardingjdbcdemo.mapper;

import com.atguigu.shardingjdbcdemo.entity.Order;
import com.atguigu.shardingjdbcdemo.entity.OrderVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface OrderMapper extends BaseMapper<Order> {


    //@Update("")
    //@Delete("")
    //@Insert("")
    @Select("SELECT o.order_no,SUM(oi.price*oi.count) amount\n" +
            "FROM t_order o INNER JOIN t_order_item oi on o.order_no = oi.order_no\n" +
            "GROUP BY o.order_no")
    List<OrderVo> getOrderAmount();


}
