package io.mate.data;

/**
 * Project : mate-admin
 * Created by Dennis Bilson on Fri at 1:15 AM.
 * Package name : io.mate.data
 */
public class Profile {
	private String cover;
	private String regular;
	private String thumb;
	
	public Profile() {
	}
	
	public Profile(String cover, String regular, String thumb) {
		this.cover = cover;
		this.regular = regular;
		this.thumb = thumb;
	}
	
	public String getCover() {
		return cover;
	}
	
	public void setCover(String cover) {
		this.cover = cover;
	}
	
	public String getRegular() {
		return regular;
	}
	
	public void setRegular(String regular) {
		this.regular = regular;
	}
	
	public String getThumb() {
		return thumb;
	}
	
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
}
