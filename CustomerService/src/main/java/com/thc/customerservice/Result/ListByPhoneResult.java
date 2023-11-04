package com.thc.customerservice.Result;

import com.thc.customerservice.Entity.Customer;
import lombok.Getter;
import org.springframework.http.HttpStatus;

public class ListByPhoneResult {
    private int code;
    private Customer data;


    public ListByPhoneResult(Customer data) {
        this.data = data;
        this.code = HttpStatus.OK.value();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Customer getData() {
        return data;
    }

    public void setData(Customer data) {
        this.data = data;
    }
}
