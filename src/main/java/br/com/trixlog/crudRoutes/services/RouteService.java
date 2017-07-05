package br.com.trixlog.crudRoutes.services;


import java.util.Date;
import java.util.List;
import br.com.trixlog.crudRoutes.Utils.RequestGoogle;
import br.com.trixlog.crudRoutes.Utils.PolylineGoogleApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.trixlog.crudRoutes.models.Route;
import br.com.trixlog.crudRoutes.models.Stop;
import br.com.trixlog.crudRoutes.repositories.IEntityRepository;
import br.com.trixlog.crudRoutes.repositories.IRouteRepository;

@Service
public class RouteService extends EntityService<Route>{

	@Autowired
	private IRouteRepository repository;
	
	@Override
	protected IEntityRepository<Route> getRepository() {
		return repository;
	}
	
	public Route createRoute(int vehicleId,Date routerDate,String name,List<Stop> stops){
		Route route = new Route();
		route.setName(name);
		route.setVehicleId(vehicleId);
		route.setRouterDate(routerDate);
		route.setStops(stops);
		route.setPath(PolylineGoogleApi.getPolyline(RequestGoogle.makeUrl(stops)));
		return repository.insert(route);
	}

}
