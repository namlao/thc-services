package com.example.demo.Service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Args.AddDemoArgs;
import com.example.demo.Repository.DemoRepository;
import com.example.demo.Result.AddDemoResult;
import com.example.demo.Service.DemoService;
import com.example.demo.entity.Demo;
import com.thc.baseservice.Args.AbstractAddEntityArgs;
import com.thc.baseservice.Result.AbstractAddEntityResult;
import com.thc.baseservice.Service.AbstractTHCService;

@Service
public class DemoServiceImpl extends AbstractTHCService<Demo> implements DemoService{

	@Autowired private DemoRepository demoRepository;

	
	
}
