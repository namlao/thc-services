package com.thc.customerservice.Response;

import com.thc.customerservice.Entity.Customer;
import com.thc.customerservice.Result.AddCustomerResult;

public class AddCustomerResponse {
    private Customer customer;

    public AddCustomerResponse(AddCustomerResult result) {
        this.customer = result.getCustomer();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
