package io.mate.data;

import com.google.firebase.firestore.GeoPoint;

/**
 * Project : mate-admin
 * Created by Dennis Bilson on Fri at 12:32 AM.
 * Package name : io.mate.data
 */
public class Trip {
	private String key;
	private String origin;
	private String destination;
	private double duration;
	private double price;
	private Driver driver;
	private Bus bus;
	private GeoPoint oGeoPoint;
	private GeoPoint dGeoPoint;
	
	public Trip() {
	}
	
	public Trip(String key, String origin, String destination, double duration, double price, Driver driver, Bus bus, GeoPoint oGeoPoint, GeoPoint dGeoPoint) {
		this.key = key;
		this.origin = origin;
		this.destination = destination;
		this.duration = duration;
		this.price = price;
		this.driver = driver;
		this.bus = bus;
		this.oGeoPoint = oGeoPoint;
		this.dGeoPoint = dGeoPoint;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public double getDuration() {
		return duration;
	}
	
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Driver getDriver() {
		return driver;
	}
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public Bus getBus() {
		return bus;
	}
	
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	public GeoPoint getoGeoPoint() {
		return oGeoPoint;
	}
	
	public void setoGeoPoint(GeoPoint oGeoPoint) {
		this.oGeoPoint = oGeoPoint;
	}
	
	public GeoPoint getdGeoPoint() {
		return dGeoPoint;
	}
	
	public void setdGeoPoint(GeoPoint dGeoPoint) {
		this.dGeoPoint = dGeoPoint;
	}
}
