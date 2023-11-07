package com.thc.customerservice.Args;

import com.thc.customerservice.Requests.DeleteCustomerRequest;

public class DeleteCustomerArgs {
    private DeleteCustomerRequest request;

    public DeleteCustomerArgs(DeleteCustomerRequest request) {
        this.request = request;
    }

    public DeleteCustomerRequest getRequest() {
        return request;
    }

    public void setRequest(DeleteCustomerRequest request) {
        this.request = request;
    }
}
