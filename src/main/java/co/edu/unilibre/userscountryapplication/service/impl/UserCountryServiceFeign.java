package co.edu.unilibre.userscountryapplication.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unilibre.userscountryapplication.feign.UserServiceClientFeign;
import co.edu.unilibre.userscountryapplication.feign.CountryServiceClientFeign;
import co.edu.unilibre.userscountryapplication.model.UserCountry;
import co.edu.unilibre.userscountryapplication.service.UserCountryService;
import co.edu.unilibre.userscountryapplication.model.Country;
import co.edu.unilibre.userscountryapplication.model.User;


@Service("UserCountryServiceFeign")
public class UserCountryServiceFeign implements UserCountryService{

	@Autowired
	private UserServiceClientFeign userServiceClientFeign;
	private CountryServiceClientFeign countryServiceClientFeign;
	
	@Override
	public List<UserCountry> getAll() {
		List<User> users = userServiceClientFeign.getList();
		List<Country> countries = countryServiceClientFeign.getList();
		List<UserCountry> finallist = new ArrayList<>();
		for(User user:users) {
			
			for(Country c : countries) {
				if(c.getId() == user.getCountryId()) {
					UserCountry x = new UserCountry(c,user);
					finallist.add(x);
				}
			}
		}
		return finallist.stream().collect(Collectors.toList());
	}


}
