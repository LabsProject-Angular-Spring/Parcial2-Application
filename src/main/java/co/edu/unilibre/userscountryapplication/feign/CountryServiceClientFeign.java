package co.edu.unilibre.userscountryapplication.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.edu.unilibre.userscountryapplication.model.Country;
import co.edu.unilibre.userscountryapplication.model.User;

@FeignClient(name = "country-service")
public interface CountryServiceClientFeign {
	
	@GetMapping("/list-country")
	public List<Country> getList();
	
}
