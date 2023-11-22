package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Demo;
import com.thc.baseservice.Mapper.THCMapper;

@Mapper
public interface DemoMapper extends THCMapper<Demo,String>{

}
