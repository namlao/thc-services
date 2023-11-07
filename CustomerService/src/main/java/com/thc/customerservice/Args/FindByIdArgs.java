package com.thc.customerservice.Args;

import com.thc.customerservice.Requests.ListByIdRequest;

public class FindByIdArgs {
	private ListByIdRequest request;
	

	public FindByIdArgs(ListByIdRequest request) {
		// TODO Auto-generated constructor stub
		this.request = request;
	}

	public ListByIdRequest getRequest() {
		return request;
	}

	public void setRequest(ListByIdRequest request) {
		this.request = request;
	}

}
