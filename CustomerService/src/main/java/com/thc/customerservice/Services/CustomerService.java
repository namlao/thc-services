package com.thc.customerservice.Services;

import com.thc.customerservice.Args.AddCustomerArgs;
import com.thc.customerservice.Args.FindByPhoneArgs;
import com.thc.customerservice.Args.UpdateCustomerArgs;
import com.thc.customerservice.Entity.Customer;

import java.util.List;

public interface CustomerService {
    public Customer createCart(AddCustomerArgs cart);

    public Customer getCustomer(String id);

    public Customer getCustomerByPhone(FindByPhoneArgs phone);

    public List<Customer> getAllCustomer();

    public Customer updateCustomer(UpdateCustomerArgs cart);

    public int deleteCustomer(String id);
    public int deleteCustomerAll();

    public Long count();
}
