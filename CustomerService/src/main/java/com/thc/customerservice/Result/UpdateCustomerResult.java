package com.thc.customerservice.Result;

import com.thc.customerservice.Entity.Customer;

public class UpdateCustomerResult {
    private Customer customer;

    public UpdateCustomerResult(Customer customer) {
        this.customer = customer;
    }

    public Customer getResult() {
        return customer;
    }

    public void setResult(Customer result) {
        this.customer = result;
    }
}
