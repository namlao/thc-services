package com.thc.customerservice.Result;

import com.thc.customerservice.Entity.Customer;
import org.springframework.http.HttpStatus;

import java.util.List;

public class ListCustomerResult {

    private List<Customer> customerList;

    public ListCustomerResult(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public ListCustomerResult() {

    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

}
