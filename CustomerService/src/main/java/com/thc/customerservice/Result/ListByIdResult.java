package com.thc.customerservice.Result;

import com.thc.customerservice.Entity.Customer;
import org.springframework.http.HttpStatus;

public class ListByIdResult {
	private Customer customer;

	public ListByIdResult(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
