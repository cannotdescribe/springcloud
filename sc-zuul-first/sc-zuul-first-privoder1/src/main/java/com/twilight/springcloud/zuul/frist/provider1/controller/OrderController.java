package com.twilight.springcloud.zuul.frist.provider1.controller;

import com.twilight.springcloud.zuul.frist.provider1.model.OrderModel;
import com.twilight.springcloud.zuul.frist.provider1.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @GetMapping("/sc/order/{id}")
    public OrderModel findOrderById(@PathVariable Long id) {
        OrderModel orderModel = orderService.findOrderByOrderId(id);
        logger.info("Zuul路由到服务提供者①");
        return orderModel;
    }

}