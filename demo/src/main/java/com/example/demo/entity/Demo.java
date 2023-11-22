package com.example.demo.entity;

import com.thc.baseservice.Entity.AbstractEntity;

import lombok.Data;

@Data
public class Demo extends AbstractEntity {
	private String name;

	
	public Demo() {
		super();
	}

	public Demo(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [name=" + name + ", getId()=" + getId() + ", getCreated_at()=" + getCreated_at()
				+ ", getUpdated_at()=" + getUpdated_at() + ", getCreated_user()=" + getCreated_user()
				+ ", getUpdated_user()=" + getUpdated_user() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
