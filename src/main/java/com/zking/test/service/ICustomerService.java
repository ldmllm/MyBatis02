package com.zking.test.service;

import com.zking.test.model.Customer;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICustomerService {

    @Transactional(readOnly = true)
    Customer loadCsaecode(Customer customer);

}
