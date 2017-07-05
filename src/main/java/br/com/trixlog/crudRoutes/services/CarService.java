package br.com.trixlog.crudRoutes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.trixlog.crudRoutes.models.Carro;
import br.com.trixlog.crudRoutes.repositories.ICarRepository;
import br.com.trixlog.crudRoutes.repositories.IEntityRepository;

@Service
public class CarService extends EntityService<Carro> {

	@Autowired
	private ICarRepository repository;
	
	@Override
	protected IEntityRepository<Carro> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

}
