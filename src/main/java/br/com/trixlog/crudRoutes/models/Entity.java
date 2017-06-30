package br.com.trixlog.crudRoutes.models;

import org.springframework.data.annotation.Id;

public abstract class Entity {
	
	@Id
	String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
