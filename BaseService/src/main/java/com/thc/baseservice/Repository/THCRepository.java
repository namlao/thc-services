package com.thc.baseservice.Repository;

import java.util.List;

public interface THCRepository<T,K> {
	List<T> findAll(T entity);

	T findById(String id);

	int add(T entity);

	Long count();

	int deleteById(String id);

	int deleteAll();

	int update(T entiity);

}
