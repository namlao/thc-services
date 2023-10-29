package com.thc.customerservice.Repository.impl;

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
    public List<Customer> findAll() {
        return customerMapper.findAll();
    }

    @Override
    public Customer findById(String id) {
        return null;
    }

    @Override
    public int addCustomer(Customer cart) {
        return 0;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }

    @Override
    public int deleteAll() {
        return 0;
    }

    @Override
    public int updateCustomer(Customer cart) {
        return 0;
    }

    @Override
    public Customer findByPhone(String phone) {
        return null;
    }
}
