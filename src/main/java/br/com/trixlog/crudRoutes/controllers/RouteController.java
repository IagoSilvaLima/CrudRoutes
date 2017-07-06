package br.com.trixlog.crudRoutes.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.trixlog.crudRoutes.models.Route;
import br.com.trixlog.crudRoutes.models.Stop;
import br.com.trixlog.crudRoutes.services.EntityService;
import br.com.trixlog.crudRoutes.services.RouteService;

@RestController
@RequestMapping("/route")
public class RouteController  extends EntityController<Route>{

	@Autowired
	private RouteService service;
	
	@Override
	protected EntityService<Route> getService() {
		return service;
	}
	
	@PostMapping("/createRoute/{vehicleId}/{name}")
	public Route createRoute(@PathVariable int vehicleId,
			@PathVariable String name, 
				@RequestBody List<Stop> stops){
		return service.createRoute(vehicleId, new Date(), name, stops);
	}

}
