package com.thc.customerservice.Response;

import com.thc.customerservice.Args.DeleteCustomerArgs;
import com.thc.customerservice.Result.DeleteCustomerResult;
import org.springframework.http.HttpStatus;

public class DeleteCustomerResponse {
    private int result;
    private int code;

    public DeleteCustomerResponse(DeleteCustomerResult result) {
        this.result = result.getCout();
        this.code = result.getCout() != 0 ? HttpStatus.OK.value() : HttpStatus.NO_CONTENT.value();
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
