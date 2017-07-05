package br.com.trixlog.crudRoutes.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.trixlog.crudRoutes.models.Stop;

public class RequestGoogle {
	public static String makeUrl(List<Stop> stops){
		Stop source = stops.get(0);
		Stop destiny = stops.get(stops.size() -1);
		String url = String.format("https://maps.googleapis.com/maps/api/directions/json?origin=%s&destination=%s"+
		"&waypoints=optimize:true|%s",source,destiny,getWaypoints(stops));
		System.out.println(url);
		return url;
	}
	
	
	private static String getWaypoints(List<Stop> stops){
		String waypoints = "";
		if (stops.size() > 2){
			List<Stop> listWaypoints = new ArrayList<Stop>(stops.subList(1, stops.size() -1));
			waypoints = listWaypoints
					.stream()
					.map(Stop::toString)
					.collect(Collectors.joining("|"));
		}
		
		return waypoints;
	}
}
