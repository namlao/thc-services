package com.thc.customerservice.Response;

import com.thc.customerservice.Entity.Customer;
import com.thc.customerservice.Result.UpdateCustomerByPhoneResult;
import com.thc.customerservice.Result.UpdateCustomerResult;
import org.springframework.http.HttpStatus;

public class UpdateCustomerByPhoneResponse {
    private Customer customer;
    private int code;

    public UpdateCustomerByPhoneResponse(UpdateCustomerByPhoneResult result) {
        this.customer = result.getCustomer();
        this.code = result != null ? HttpStatus.OK.value() : HttpStatus.NO_CONTENT.value();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
