package com.jacobbaek.demo; 

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller public class HelloWorld { 
	@RequestMapping("/") 
	@ResponseBody 
	public String index() {
		return "hello world by root page";
	} 

	@RequestMapping("/home")
	public String home() {
		return "index.html";
	}
}
