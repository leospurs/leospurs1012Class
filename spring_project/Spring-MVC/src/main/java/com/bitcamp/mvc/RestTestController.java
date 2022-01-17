package com.bitcamp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mc/simple")
public class RestTestController {

	@GetMapping
	public String fomr() {
		return "mc/form";
	}
	
	@PostMapping
	public String simple(
			// uname=cool&age=11
			@RequestBody String bodyContent
			
			) {
			System.out.println("body: " + bodyContent);
			return "Y";
		
	}
}
