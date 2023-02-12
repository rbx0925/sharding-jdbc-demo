package com.atguigu.shardingjdbcdemo.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderVo {
    //订单编号
    private String orderNo;
    //订单总金额
    private BigDecimal amount;
}
