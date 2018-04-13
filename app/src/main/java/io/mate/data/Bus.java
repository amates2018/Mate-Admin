package io.mate.data;

/**
 * Project : mate-admin
 * Created by Dennis Bilson on Fri at 12:32 AM.
 * Package name : io.mate.data
 */
public class Bus {
	private String key;
	private String number;
	private String type;
	private String image;
	private String terminalKey;
	private int seats;
	
	public Bus() {
	}
	
	public Bus(String key, String number, String type, String image, String terminalKey, int seats) {
		this.key = key;
		this.number = number;
		this.type = type;
		this.image = image;
		this.terminalKey = terminalKey;
		this.seats = seats;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getTerminalKey() {
		return terminalKey;
	}
	
	public void setTerminalKey(String terminalKey) {
		this.terminalKey = terminalKey;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
}
