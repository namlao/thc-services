package com.thc.customerservice.Response;

import com.thc.customerservice.Entity.Customer;
import com.thc.customerservice.Result.ListCustomerResult;
import org.springframework.http.HttpStatus;

import java.util.List;

public class ListAllCustomerResponse {
    private List<Customer> list;
    private int code;
    private int count;
    public ListAllCustomerResponse(ListCustomerResult list) {
        this.list = list.getCustomerList();
        this.code = HttpStatus.OK.value();
        this.count = list.getCustomerList().size();
    }

    public List<Customer> getList() {
        return list;
    }

    public void setList(List<Customer> list) {
        this.list = list;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
    
    
}
