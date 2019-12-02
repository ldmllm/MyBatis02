package com.zking.test.service.impl;

import com.zking.test.model.Customer;
import com.zking.test.service.BaseTestCase;
import com.zking.test.service.ICustomerService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CustomerServiceImplTest extends BaseTestCase {
    @Autowired
    private ICustomerService customerService;

    private Customer customer;

    @Override
    public void before() {
        super.before();
        customer=new Customer();

    }

    @Test
    public void loadCsaecode() {
        customer.setCustomerId(1);
        Customer customer1 = customerService.loadCsaecode(this.customer);
        System.out.println(customer1);
        System.out.println(customer1.getOrderList());


    }
}