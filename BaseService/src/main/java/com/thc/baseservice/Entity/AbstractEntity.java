package com.thc.baseservice.Entity;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Id;

import lombok.Data;

@Data
public abstract class AbstractEntity {
	@Id
	private String id;
	private LocalDate created_at;
	private LocalDate updated_at;
	private String created_user;
	private String updated_user;
	
	
	public AbstractEntity() {
		this.id = UUID.randomUUID().toString();
		this.created_at = LocalDate.now();
		this.updated_at = LocalDate.now();
		this.created_user = "demo_user";
		this.updated_user = "demo_user";
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
