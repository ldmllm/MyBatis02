package com.zking.test.service.impl;

import com.zking.test.mapper.OrderMapper;
import com.zking.test.model.Order;
import com.zking.test.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order loadCasecode(Order order) {
        return orderMapper.loadCasecode(order);
    }
}
