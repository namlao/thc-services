package com.thc.customerservice.Services;

import com.thc.customerservice.Args.*;
import com.thc.customerservice.Entity.Customer;
import com.thc.customerservice.Result.*;

public interface CustomerService {
    public AddCustomerResult createCart(AddCustomerArgs cart);

    public ListByIdResult getCustomer(FindByIdArgs args);

    public FindByPhoneResult getCustomerByPhone(FindByPhoneArgs phone);

    public ListCustomerResult getAllCustomer(ListAllCustomerArgs args);

    public UpdateCustomerResult updateCustomer(UpdateCustomerArgs args);
    public UpdateCustomerByPhoneResult updateCustomerByPhone(UpdateCustomerByPhoneArgs args);

    public DeleteCustomerResult deleteCustomer(DeleteCustomerArgs args);
    public int deleteCustomerAll();

    public Long count();
}
