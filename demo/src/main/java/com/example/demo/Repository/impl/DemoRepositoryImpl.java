package com.example.demo.Repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Mapper.DemoMapper;
import com.example.demo.Repository.DemoRepository;
import com.example.demo.entity.Demo;

@Repository
public class DemoRepositoryImpl implements DemoRepository{
	@Autowired private DemoMapper mapper;

	@Override
	public List<Demo> findAll(Demo entity) {
		// TODO Auto-generated method stub
		return mapper.findAll(entity);
	}

	@Override
	public Demo findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Demo add(Demo entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Demo entiity) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
