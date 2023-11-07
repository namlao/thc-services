package com.thc.customerservice.Result;

import com.thc.customerservice.Entity.Customer;

public class AddCustomerResult {
    private Customer customer;

    public AddCustomerResult(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
