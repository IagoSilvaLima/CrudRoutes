package br.com.trixlog.crudRoutes.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.trixlog.crudRoutes.models.Entity;
import br.com.trixlog.crudRoutes.services.EntityService;


@RestController
@CrossOrigin(origins = "*")
public abstract class EntityController<T extends Entity>{
	protected abstract EntityService<T> getService();
	
	
	@GetMapping
	public List<T> findAll(){
		return getService().findAll();
	}

	@PutMapping
	public T update(@RequestBody T entity){
		return getService().update(entity);
	}
	
	
	@PostMapping
	public T insert(@RequestBody T entity){
		return getService().insert(entity);
	}
	
	@GetMapping("/{id}")
	public T findOne(@PathVariable String id){
		return getService().findOne(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id){
		getService().delete(id);
	}
}
