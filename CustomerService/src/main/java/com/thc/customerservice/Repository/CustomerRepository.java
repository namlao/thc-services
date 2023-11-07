package com.thc.customerservice.Repository;

import com.thc.customerservice.Args.ListAllCustomerArgs;
import com.thc.customerservice.Entity.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll(ListAllCustomerArgs args);

    Customer findById(String id);

    int addCustomer(Customer cart);

    Long count();

    int deleteById(String id);

    int deleteAll();

    int updateCustomer(Customer cart);

    Customer findByPhone(String phone);
}
