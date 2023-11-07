package com.thc.customerservice.Args;

import com.thc.customerservice.Requests.ListAllCustomerRequest;

public class ListAllCustomerArgs {
    private ListAllCustomerRequest request;

    public ListAllCustomerArgs(ListAllCustomerRequest request) {
        this.request  = request;
    }

    public ListAllCustomerArgs listAllCustomerArgs(){
        return new ListAllCustomerArgs(this.request);
    }

    public String getId() {
        return this.request.getId();
    }

    public String getName() {
        return this.request.getName();
    }

    public String getPhone() {
        return this.request.getPhone();
    }
}
