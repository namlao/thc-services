package com.thc.customerservice.Result;

import com.thc.customerservice.Entity.Customer;

public class FindByPhoneResult {
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public FindByPhoneResult(Customer customer) {
		super();
		this.customer = customer;
	}
	
	
}
