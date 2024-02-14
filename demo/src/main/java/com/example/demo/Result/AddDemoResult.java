package com.example.demo.Result;

import com.example.demo.entity.Demo;
import com.thc.baseservice.Result.AbstractEntityResult;

public class AddDemoResult extends AbstractEntityResult<Demo> {
	public AddDemoResult(Demo entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
