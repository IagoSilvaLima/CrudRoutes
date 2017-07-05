package br.com.trixlog.crudRoutes.services;

import java.util.List;
import br.com.trixlog.crudRoutes.models.Entity;
import br.com.trixlog.crudRoutes.repositories.IEntityRepository;


public abstract class EntityService<T extends Entity> {
	protected abstract IEntityRepository<T> getRepository();
	
	public List<T> findAll(){
		return getRepository().findAll();
	}
	
	
	public T insert(T entity){
		return getRepository().insert(entity);
	}
	
	public T update(T entity){
		return getRepository().save(entity);
	}
	
	public T findOne(String id){
		return getRepository().findOne(id);
	}
	
	public void delete(String id){
		getRepository().delete(id);
	}
	
	
}
