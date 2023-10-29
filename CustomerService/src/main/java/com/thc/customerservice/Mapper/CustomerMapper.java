package com.thc.customerservice.Mapper;

import com.thc.customerservice.Entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    List<Customer> findAll();

    Customer findById(String id);

    int addCustomer(Customer cart);

    Long count();

    int deleteById(String id);

    int deleteAll();

    int updateCustomer(Customer cart);

    Customer findByPhone(String phone);
}
