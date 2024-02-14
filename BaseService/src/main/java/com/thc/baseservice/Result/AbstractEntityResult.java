package com.thc.baseservice.Result;

import java.time.LocalDate;

import com.thc.baseservice.Entity.AbstractEntity;

public class AbstractEntityResult<R extends AbstractEntity> {
	private R entity;
	private String id;
	private LocalDate created_at;
	private LocalDate updated_at;
	private String created_user;
	private String updated_user;
	public AbstractEntityResult(R entity) {
		super();
		this.entity = entity;
	}

	
	public AbstractEntityResult(R entity, String id, LocalDate created_at, LocalDate updated_at, String created_user,
			String updated_user) {
		super();
		this.entity = entity;
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.created_user = created_user;
		this.updated_user = updated_user;
	}


	public R getEntity() {
		return entity;
	}

	public void setEntity(R entity) {
		this.entity = entity;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public LocalDate getCreated_at() {
		return created_at;
	}


	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}


	public LocalDate getUpdated_at() {
		return updated_at;
	}


	public void setUpdated_at(LocalDate updated_at) {
		this.updated_at = updated_at;
	}


	public String getCreated_user() {
		return created_user;
	}


	public void setCreated_user(String created_user) {
		this.created_user = created_user;
	}


	public String getUpdated_user() {
		return updated_user;
	}


	public void setUpdated_user(String updated_user) {
		this.updated_user = updated_user;
	}
	
	
	

}
