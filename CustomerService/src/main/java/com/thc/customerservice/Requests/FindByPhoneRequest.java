package com.thc.customerservice.Requests;

public class FindByPhoneRequest {
	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public FindByPhoneRequest(String phone) {
		super();
		this.phone = phone;
	}
	
	
}
