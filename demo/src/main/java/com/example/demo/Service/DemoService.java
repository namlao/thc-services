package com.example.demo.Service;

import com.example.demo.Args.AddDemoArgs;
import com.example.demo.Result.AddDemoResult;
import com.example.demo.entity.Demo;
import com.thc.baseservice.Service.THCService;

public interface DemoService extends THCService<Demo>{
	 AddDemoResult create(AddDemoArgs args);
}
