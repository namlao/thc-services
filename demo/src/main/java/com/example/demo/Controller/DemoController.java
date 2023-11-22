package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Args.AddDemoArgs;
import com.example.demo.Repository.DemoRepository;
import com.example.demo.Result.AddDemoResult;
import com.example.demo.Service.DemoService;
import com.example.demo.entity.Demo;
import com.thc.baseservice.Service.AbstractTHCService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	private DemoService demoService;
	
	@GetMapping("/test")
    public void index() {
		Demo args = new Demo("nam");
		demoService.create(args);
    }
}
