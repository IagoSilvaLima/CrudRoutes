package br.com.trixlog.crudRoutes.Utils;

import java.util.LinkedHashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PolylineGoogleApi {

	public static String getPolyline(String url){
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<LinkedHashMap> response
		  = restTemplate.getForEntity(url, LinkedHashMap.class);
		
		return Convert.polylineFromLinkedHashMap(response.getBody());
	}
}
