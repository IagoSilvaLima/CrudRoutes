package br.com.trixlog.crudRoutes.Utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Convert {
	public static String polylineFromLinkedHashMap(LinkedHashMap response){
		LinkedHashMap rota=   ((LinkedHashMap)((ArrayList<Object>)response.get("routes")).get(0));
		String polyline = ((LinkedHashMap)rota.get("overview_polyline")).get("points").toString();
		return polyline;
	}
}
