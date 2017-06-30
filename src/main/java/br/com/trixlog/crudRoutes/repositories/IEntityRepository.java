package br.com.trixlog.crudRoutes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.trixlog.crudRoutes.models.Entity;

public interface IEntityRepository<T extends Entity> extends MongoRepository<T,String>{

}
