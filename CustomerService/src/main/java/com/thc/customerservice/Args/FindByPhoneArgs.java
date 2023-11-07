package com.thc.customerservice.Args;

import com.thc.customerservice.Requests.FindByPhoneRequest;

public class FindByPhoneArgs {
	private FindByPhoneRequest request;

	public FindByPhoneArgs(FindByPhoneRequest request) {
		super();
		this.request = request;
	}

	public FindByPhoneRequest getRequest() {
		return request;
	}

	public void setRequest(FindByPhoneRequest request) {
		this.request = request;
	}


}
