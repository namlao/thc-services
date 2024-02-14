package com.example.demo.Args;

import com.example.demo.entity.Demo;
import com.thc.baseservice.Args.AbstractEntityArgs;

public class AddDemoArgs extends AbstractEntityArgs<Demo>{

	private Demo  demo;
	
	public AddDemoArgs(Demo entity) {
		super(entity);
		this.demo = entity;
		// TODO Auto-generated constructor stub
	}

	public Demo getDemo() {
		return demo;
	}

	public void setDemo(Demo demo) {
		this.demo = demo;
	}
	
	
	
}
