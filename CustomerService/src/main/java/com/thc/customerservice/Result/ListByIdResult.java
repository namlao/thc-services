package com.thc.customerservice.Result;

import com.thc.customerservice.Entity.Customer;
import org.springframework.http.HttpStatus;

public class ListByIdResult {
    private int code;
    private Customer data;


    public ListByIdResult(Customer data) {
        this.data = data;
        this.code = HttpStatus.OK.value();
    }


    public Customer getData() {
        return data;
    }

    public void setData(Customer data) {
        this.data = data;
    }
}
