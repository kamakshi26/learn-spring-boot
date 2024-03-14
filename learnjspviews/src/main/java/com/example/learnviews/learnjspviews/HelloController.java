package com.example.learnviews.learnjspviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	
	
	@RequestMapping("helloworld")
	public String sayHelloWorld(@RequestParam(required=false) String name,ModelMap model) {
		model.put("name", name);
		return "sayHello";
	}

}
