package com.example.demo.Service.Impl;

import org.springframework.stereotype.Service;

import com.example.demo.Args.AddDemoArgs;
import com.example.demo.Repository.DemoRepository;
import com.example.demo.Result.AddDemoResult;
import com.example.demo.Service.DemoService;
import com.example.demo.entity.Demo;
import com.thc.baseservice.Args.AbstractEntityArgs;
import com.thc.baseservice.Entity.AbstractEntity;
import com.thc.baseservice.Result.AbstractEntityResult;

@Service
public class DemoServiceImpl implements DemoService{

	private DemoRepository demoRepository;

	public AddDemoResult create(AddDemoArgs args) {

		Demo demo = args.getDemo();
		return new AddDemoResult(demoRepository.add(demo));

	}

	@Override
	public <R extends AbstractEntityResult<Demo>, A extends AbstractEntityArgs<AbstractEntity>> R create(A args) {
		// TODO Auto-generated method stub
		return null;
	}
}
