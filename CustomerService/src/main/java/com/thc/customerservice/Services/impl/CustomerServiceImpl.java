package com.thc.customerservice.Services.impl;

import com.thc.customerservice.Args.*;
import com.thc.customerservice.Entity.Customer;
import com.thc.customerservice.Repository.CustomerRepository;
import com.thc.customerservice.Result.*;
import com.thc.customerservice.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public AddCustomerResult createCart(AddCustomerArgs cart) {
        Customer customer = new Customer(cart.getRequest().getName(),cart.getRequest().getPhone());
        AddCustomerResult result = new AddCustomerResult(customer);
        return result;
    }

    @Override
    public ListByIdResult getCustomer(FindByIdArgs args) {
    	Customer customer = customerRepository.findById(args.getRequest().getId());
    	ListByIdResult result = new ListByIdResult(customer);
        return result;
    }

    @Override
    public FindByPhoneResult getCustomerByPhone(FindByPhoneArgs args) {
    	FindByPhoneResult result = new FindByPhoneResult(customerRepository.findByPhone(args.getRequest().getPhone())) ;
        return result;
    }

    @Override
    public ListCustomerResult getAllCustomer(ListAllCustomerArgs args) {
            List<Customer> customerList = customerRepository.findAll(args);
            return new ListCustomerResult(customerList);

    }

    @Override
    public UpdateCustomerResult updateCustomer(UpdateCustomerArgs args) {

        int rs = customerRepository.updateCustomer(new Customer(args.getRequest().getId(),args.getRequest().getName(),args.getRequest().getPhone(),args.getRequest().getPoint(),args.getRequest().getLevel()));
        String id = args.getRequest().getId();
        Customer customer = customerRepository.findById(id);
        UpdateCustomerResult result = new UpdateCustomerResult(rs != 0? customer :null);
        return result;
    }

    @Override
    public UpdateCustomerResult updateCustomerByPhone(UpdateCustomerArgs args) {
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
