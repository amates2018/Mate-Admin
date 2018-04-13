package io.mate.data;

import com.google.firebase.firestore.GeoPoint;

/**
 * Project : mate-admin
 * Created by Dennis Bilson on Fri at 12:32 AM.
 * Package name : io.mate.data
 */
public class Terminal {
	private String key;
	private String name;
	private GeoPoint location;
	private Driver drivers;
	
	public Terminal() {
	}
	
	public Terminal(String key, String name, GeoPoint location, Driver drivers) {
		this.key = key;
		this.name = name;
		this.location = location;
		this.drivers = drivers;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public GeoPoint getLocation() {
		return location;
	}
	
	public void setLocation(GeoPoint location) {
		this.location = location;
	}
	
	public Driver getDrivers() {
		return drivers;
	}
	
	public void setDrivers(Driver drivers) {
		this.drivers = drivers;
	}
}
