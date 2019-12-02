package com.zking.test.service.impl;

import com.zking.test.mapper.CustomerMapper;
import com.zking.test.model.Customer;
import com.zking.test.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public Customer loadCsaecode(Customer customer) {
        return customerMapper.loadCasecode(customer);
    }
}
