package com.thc.baseservice.Args;

import com.thc.baseservice.Entity.AbstractEntity;

public class AbstractEntityArgs<T extends AbstractEntity> {
	private T entity;

	public AbstractEntityArgs(T entity) {
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
