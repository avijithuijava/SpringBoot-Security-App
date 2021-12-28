package in.avijit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping(value = "/welcome")
	public String welcome() {

		String msg = " Welcome To Spring Boot Security Implementation...!!!";
		return msg;
	}

}
