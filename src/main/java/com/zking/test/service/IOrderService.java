package com.zking.test.service;

import com.zking.test.model.Order;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IOrderService {
    @Transactional(readOnly = true)
    Order loadCasecode(Order order);
}
