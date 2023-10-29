package com.thc.customerservice.Services.impl;

import com.thc.customerservice.Args.AddCustomerArgs;
import com.thc.customerservice.Args.UpdateCustomerArgs;
import com.thc.customerservice.Entity.Customer;
import com.thc.customerservice.Repository.CustomerRepository;
import com.thc.customerservice.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCart(AddCustomerArgs cart) {
        return null;
    }

    @Override
    public Customer getCustomer(String id) {
        return null;
    }

    @Override
    public Customer getCustomerByPhone(String phone) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(UpdateCustomerArgs cart) {
        return null;
    }

    @Override
    public int deleteCustomer(String id) {
        return 0;
    }

    @Override
    public int deleteCustomerAll() {
        return 0;
    }

    @Override
    public Long count() {
        return null;
    }
}
