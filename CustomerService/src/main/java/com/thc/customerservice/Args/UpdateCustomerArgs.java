package com.thc.customerservice.Args;

import com.thc.customerservice.Requests.UpdateCustomerByPhoneRequest;
import com.thc.customerservice.Requests.UpdateCustomerRequest;

public class UpdateCustomerArgs {
    private UpdateCustomerRequest request;

    public UpdateCustomerArgs(UpdateCustomerRequest request) {
        this.request = request;
    }
    public UpdateCustomerRequest getRequest() {
        return request;
    }

    public void setRequest(UpdateCustomerRequest request) {
        this.request = request;
    }
}
