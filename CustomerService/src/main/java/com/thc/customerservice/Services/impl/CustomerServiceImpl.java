package com.thc.customerservice.Services.impl;

import com.thc.customerservice.Args.AddCustomerArgs;
import com.thc.customerservice.Args.FindByPhoneArgs;
import com.thc.customerservice.Args.ListAllCustomerArgs;
import com.thc.customerservice.Args.UpdateCustomerArgs;
import com.thc.customerservice.Entity.Customer;
import com.thc.customerservice.Repository.CustomerRepository;
import com.thc.customerservice.Result.FindByPhoneResult;
import com.thc.customerservice.Result.ListByIdResult;
import com.thc.customerservice.Result.ListCustomerResult;
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
    public ListByIdResult getCustomer(String id) {
    	System.out.println("id: "+ id);
    	Customer customer = customerRepository.findById(id);
    	System.out.println(customer);
    	ListByIdResult result = new ListByIdResult(customer);
        return result;
    }

    @Override
    public FindByPhoneResult getCustomerByPhone(FindByPhoneArgs args) {
    	FindByPhoneResult result = new FindByPhoneResult(customerRepository.findByPhone(args.getPhone())) ;
        return result;
    }

    @Override
    public ListCustomerResult getAllCustomer(ListAllCustomerArgs args) {
            List<Customer> customerList = customerRepository.findAll(args);
            return new ListCustomerResult(customerList);

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
