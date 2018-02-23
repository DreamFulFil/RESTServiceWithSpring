package dream.blog.practice.rest.service.restcontrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

	@RequestMapping(value = "/greetings", method = RequestMethod.GET)
	public String greetings() {
		return "Hello World!";
	}
	
}
