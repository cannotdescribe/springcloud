package com.twilight.springcloud.zuul.frist.provider1.service;

import com.twilight.springcloud.zuul.frist.provider1.model.OrderModel;

public interface OrderService {
    public OrderModel findOrderByOrderId(Long orderId);
}
