package com.thc.customerservice.Repository.impl;

import com.thc.customerservice.Args.ListAllCustomerArgs;
import com.thc.customerservice.Entity.Customer;
import com.thc.customerservice.Mapper.CustomerMapper;
import com.thc.customerservice.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> findAll(ListAllCustomerArgs args) {
        return customerMapper.findAll(args);
    }

    @Override
    public Customer findById(String id) {
        return customerMapper.findById(id);
    }

    @Override
    public int addCustomer(Customer cart) {
        return customerMapper.addCustomer(cart);
    }

    @Override
    public Long count() {
        return customerMapper.count();
    }

    @Override
    public int deleteById(String id) {
        return customerMapper.deleteById(id);
    }

    @Override
    public int deleteAll() {
        return customerMapper.deleteAll();
    }

    @Override
    public int updateCustomer(Customer cart) {
        return customerMapper.updateCustomer(cart);
    }

    @Override
    public Customer findByPhone(String phone) {
        return customerMapper.findByPhone(phone);
    }
}
