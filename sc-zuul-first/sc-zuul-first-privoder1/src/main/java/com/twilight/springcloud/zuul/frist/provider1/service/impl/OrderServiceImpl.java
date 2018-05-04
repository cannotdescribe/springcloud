package com.twilight.springcloud.zuul.frist.provider1.service.impl;

import com.twilight.springcloud.zuul.frist.provider1.entity.Order;
import com.twilight.springcloud.zuul.frist.provider1.model.OrderModel;
import com.twilight.springcloud.zuul.frist.provider1.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService{
    @Override
    public OrderModel findOrderByOrderId(Long orderId) {
        OrderModel orderModel = new OrderModel();
        if (orderId.equals(2L)) {
            Order order = new Order();
            order.setCreateTime(new Date());
            order.setOrderNo(2L);
            BeanUtils.copyProperties(order, orderModel);
        }
        return orderModel;
    }
}
