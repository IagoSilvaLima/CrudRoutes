package br.com.trixlog.crudRoutes.models;

import java.util.Date;
import java.util.List;


public class Route extends Entity{
	private String name;
	

	private Date routerDate;
	
	private int vehicleId;
	private List<Stop> stops;
	private String path;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRouterDate() {
		return routerDate;
	}
	public void setRouterDate(Date routerDate) {
		this.routerDate = routerDate;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public List<Stop> getStops() {
		return stops;
	}
	public void setStops(List<Stop> stops) {
		this.stops = stops;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
}
