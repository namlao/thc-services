package com.thc.customerservice.Services;

import com.thc.customerservice.Args.AddCustomerArgs;
import com.thc.customerservice.Args.FindByPhoneArgs;
import com.thc.customerservice.Args.ListAllCustomerArgs;
import com.thc.customerservice.Args.UpdateCustomerArgs;
import com.thc.customerservice.Entity.Customer;
import com.thc.customerservice.Result.FindByPhoneResult;
import com.thc.customerservice.Result.ListByIdResult;
import com.thc.customerservice.Result.ListCustomerResult;

public interface CustomerService {
    public Customer createCart(AddCustomerArgs cart);

    public ListByIdResult getCustomer(String id);

    public FindByPhoneResult getCustomerByPhone(FindByPhoneArgs phone);

    public ListCustomerResult getAllCustomer(ListAllCustomerArgs args);

    public Customer updateCustomer(UpdateCustomerArgs cart);

    public int deleteCustomer(String id);
    public int deleteCustomerAll();

    public Long count();
}
