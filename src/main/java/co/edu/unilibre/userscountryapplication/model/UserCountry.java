package co.edu.unilibre.userscountryapplication.model;

public class UserCountry {
	private String country;
	private String user;
	
	public UserCountry(String country, String user) {
		super();
		this.country = country;
		this.user = user;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	} 
}
