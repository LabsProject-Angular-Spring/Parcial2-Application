package co.edu.unilibre.userscountryapplication.model;

public class UserCountry {
	private Country country;
	private User user;
	
	public UserCountry(Country country, User user) {
		super();
		this.country = country;
		this.user = user;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	} 
}
