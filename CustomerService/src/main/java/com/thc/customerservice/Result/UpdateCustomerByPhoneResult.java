package com.thc.customerservice.Result;

import com.thc.customerservice.Entity.Customer;

public class UpdateCustomerByPhoneResult {
    private Customer customer;

    public UpdateCustomerByPhoneResult() {
    }

    public UpdateCustomerByPhoneResult(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
