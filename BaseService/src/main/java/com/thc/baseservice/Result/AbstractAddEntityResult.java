package com.thc.baseservice.Result;

import com.thc.baseservice.Entity.AbstractEntity;

public class AbstractAddEntityResult<R extends AbstractEntity> {
	private R entity;

	public AbstractAddEntityResult(R entity) {
		super();
		this.entity = entity;
	}

	public R getEntity() {
		return entity;
	}

	public void setEntity(R entity) {
		this.entity = entity;
	}
	
	
	

}
