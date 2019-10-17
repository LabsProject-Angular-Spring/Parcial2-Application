package co.edu.unilibre.userscountryapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.userscountryapplication.model.UserCountry;
import co.edu.unilibre.userscountryapplication.service.UserCountryService;

@RestController
public class UserCountryController {
	
	@Autowired(required = true)
	@Qualifier("UserCountryServiceFeignClient")
	private UserCountryService CountryUserService;
	
	@GetMapping("/all-user")
	public List<UserCountry> getAll(){
		return CountryUserService.getAll();
	}	

}
