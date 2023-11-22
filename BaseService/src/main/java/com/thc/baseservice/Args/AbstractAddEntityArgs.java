package com.thc.baseservice.Args;

import com.thc.baseservice.Entity.AbstractEntity;

public class AbstractAddEntityArgs<T extends AbstractEntity> {
	private T entity;

	public AbstractAddEntityArgs(T entity) {
		super();
		this.entity = entity;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}
	
	
	
}
