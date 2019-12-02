package com.zking.test.service;

import com.zking.test.model.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class IOrderServiceTest extends BaseTestCase{
    @Autowired
    private  IOrderService orderService;

    private Order order;
    @Override
    public void before() {
        super.before();
        order=new Order();
    }

    @Test
    public void loadCasecode() {
        order.setOrderId(1);
        Order order1 = orderService.loadCasecode(this.order);
        System.out.println(order1);

        System.out.println(order1.getCustomer());

    }
}