package br.com.trixlog.crudRoutes.controllers;





import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.trixlog.crudRoutes.models.Carro;
import br.com.trixlog.crudRoutes.services.CarService;
import br.com.trixlog.crudRoutes.services.EntityService;



@RestController
@RequestMapping("/car")
public class CarController extends EntityController<Carro>{

	@Autowired
	private CarService service;
	
	
	
	@GetMapping(value = "google")
	public LinkedHashMap GoogleApi(){
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "https://maps.googleapis.com/maps/api/directions/json?origin=-3.8043725,-38.4588504&destination=-3.8082163,-38.4615963";
		ResponseEntity<LinkedHashMap> response
		  = restTemplate.getForEntity(fooResourceUrl, LinkedHashMap.class);
		
		LinkedHashMap resposta  = response.getBody();
		
		LinkedHashMap rota=   ((LinkedHashMap)((ArrayList<Object>)resposta.get("routes")).get(0));
		Object polyline = ((LinkedHashMap)rota.get("overview_polyline")).get("points");
		
		System.out.println(polyline.toString());
		
		
		
		
		
		
		
		
		return resposta;
		
	}


	@Override
	protected EntityService<Carro> getService() {
		// TODO Auto-generated method stub
		return service;
	}
	
	

}
