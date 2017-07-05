package br.com.trixlog.crudRoutes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.trixlog.crudRoutes.models.Entity;

@Repository
public interface IEntityRepository<T extends Entity> extends MongoRepository<T,String>{

}
