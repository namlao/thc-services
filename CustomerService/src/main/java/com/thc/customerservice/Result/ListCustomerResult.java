package com.thc.customerservice.Result;

import com.thc.customerservice.Entity.Customer;
import org.springframework.http.HttpStatus;

import java.util.List;

public class ListCustomerResult {
    private int count;
    private int code;
    private List<Customer> carts;

    public ListCustomerResult(List<Customer> cart) {
        this.carts = cart;
        this.code = HttpStatus.OK.value();
        this.count = cart.size();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Customer> getCarts() {
        return carts;
    }

    public void setCarts(List<Customer> carts) {
        this.carts = carts;
    }
}
