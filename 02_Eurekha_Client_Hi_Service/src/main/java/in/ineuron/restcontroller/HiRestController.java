package in.ineuron.restcontroller;

import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.converters.Auto;

import in.ineuron.client.HelloClient;

@RestController
public class HiRestController {
	
	@Autowired
	private HelloClient client;
	
	@GetMapping("/hi/{name}")
	public String sayHi(@PathVariable("name") String name) {
		System.out.println("Implementation class name is::"+client.getClass().getName());
		String msg="Hi ";
		String helloMsg=client.invokeHelloService(name);
		return "Hi message is::"+msg+name+", how r u?------>"+"Hello message is::"+helloMsg;
	}

}
