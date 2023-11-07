package com.thc.customerservice.Args;

import com.thc.customerservice.Requests.AddCustomerRequest;

public class AddCustomerArgs {
    private AddCustomerRequest request;

    public AddCustomerArgs(AddCustomerRequest request) {
        this.request = request;
    }

    public AddCustomerRequest getRequest() {
        return request;
    }

    public void setRequest(AddCustomerRequest request) {
        this.request = request;
    }
}
