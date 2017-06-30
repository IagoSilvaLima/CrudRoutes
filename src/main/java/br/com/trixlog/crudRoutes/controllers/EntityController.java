package br.com.trixlog.crudRoutes.controllers;

import java.util.List;

import br.com.trixlog.crudRoutes.models.Entity;
import br.com.trixlog.crudRoutes.services.EntityService;

public abstract class EntityController<T extends Entity>{
	protected abstract EntityService<T> getService();
	
	public List<T> findAll(){
		return getService().findAll();
	}
	
	public void InsertOrUpdate(T entity){
		getService().InsertOrUpdate(entity);
	}
	
	public T findOne(String id){
		return getService().findOne(id);
	}
	
	public void delete(String id){
		getService().delete(id);
	}
}
