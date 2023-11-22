package com.thc.baseservice.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface THCMapper<T,K> {
	List<T> findAll(T entity);

	T findById(String id);

	int add(T entity);

	Long count();

	int deleteById(String id);

	int deleteAll();

	int update(T entiity);

}
