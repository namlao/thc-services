package com.thc.customerservice.Args;

import com.thc.customerservice.Requests.UpdateCustomerByPhoneRequest;

public class UpdateCustomerByPhoneArgs {
    private UpdateCustomerByPhoneRequest request;

    public UpdateCustomerByPhoneArgs(UpdateCustomerByPhoneRequest request) {
        this.request = request;
    }

    public UpdateCustomerByPhoneRequest getRequest() {
        return request;
    }

    public void setRequest(UpdateCustomerByPhoneRequest request) {
        this.request = request;
    }
}
