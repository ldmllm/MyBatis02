package com.zking.test.mapper;

import com.zking.test.model.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer loadCasecode(Customer record);

    Customer selectByPrimaryKey(Integer customerId);


    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);




}