package com.thc.customerservice.Response;

import com.thc.customerservice.Args.UpdateCustomerArgs;
import com.thc.customerservice.Entity.Customer;
import com.thc.customerservice.Result.UpdateCustomerResult;
import org.springframework.http.HttpStatus;

public class UpdateCustomerResponse {
    private Customer result;
    private int code;

    public UpdateCustomerResponse(UpdateCustomerResult result) {
        this.result = result.getResult();
        this.code = result.getResult() != null ? HttpStatus.OK.value() : HttpStatus.NOT_FOUND.value();
    }

    public Customer getResult() {
        return result;
    }

    public void setResult(Customer result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
