package com.thc.customerservice.Response;

import org.springframework.http.HttpStatus;

import com.thc.customerservice.Entity.Customer;
import com.thc.customerservice.Result.FindByPhoneResult;

public class FindByPhoneResponse {
	private Customer customer;
	private int code;

	public FindByPhoneResponse(FindByPhoneResult customer) {
		super();
		this.customer = customer.getCustomer();
		this.code = HttpStatus.OK.value();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
