package io.mate.data;

/**
 * Project : mate-admin
 * Created by Dennis Bilson on Fri at 12:32 AM.
 * Package name : io.mate.data
 */
public class Driver {
	private String key;
	private String username;
	private String email;
	private String phone;
	private Profile profile;
	private String busKey;
	private String busNumber;
	private String busType;
	private String terminalKey;
	private boolean isTracking;
	
	
	public Driver() {
	}
	
	public Driver(String key, String username,
	              String email, String phone, Profile profile, String busKey,
	              String busNumber, String busType, String terminalKey, boolean isTracking) {
		this.key = key;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.profile = profile;
		this.busKey = busKey;
		this.busNumber = busNumber;
		this.busType = busType;
		this.terminalKey = terminalKey;
		this.isTracking = isTracking;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Profile getProfile() {
		return profile;
	}
	
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	public String getBusKey() {
		return busKey;
	}
	
	public void setBusKey(String busKey) {
		this.busKey = busKey;
	}
	
	public String getBusNumber() {
		return busNumber;
	}
	
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	
	public String getBusType() {
		return busType;
	}
	
	public void setBusType(String busType) {
		this.busType = busType;
	}
	
	public String getTerminalKey() {
		return terminalKey;
	}
	
	public void setTerminalKey(String terminalKey) {
		this.terminalKey = terminalKey;
	}
	
	public boolean isTracking() {
		return isTracking;
	}
	
	public void setTracking(boolean tracking) {
		isTracking = tracking;
	}
}
