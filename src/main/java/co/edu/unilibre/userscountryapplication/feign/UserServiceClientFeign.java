package co.edu.unilibre.userscountryapplication.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.edu.unilibre.userscountryapplication.model.Country;
import co.edu.unilibre.userscountryapplication.model.User;

@FeignClient(name = "user-service")
public interface UserServiceClientFeign {
	
	@GetMapping("/list-user")
	public List<User> getList();
	
}
