package dream.blog.practice.rest.service.restcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloController {

	@ResponseBody
	@RequestMapping(value = "/greetings", method = RequestMethod.GET)
	public String greetings() {
		return "Hello World!";
	}
	
}
