package in.ineuron.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		String msg="Hello ";
		return msg+name+", how r u?";
	}

}
