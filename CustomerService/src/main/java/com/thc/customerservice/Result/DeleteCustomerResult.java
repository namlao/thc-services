package com.thc.customerservice.Result;

public class DeleteCustomerResult {
    private int cout;

    public DeleteCustomerResult() {
    }
    public DeleteCustomerResult(int cout) {
        this.cout = cout;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }
}
