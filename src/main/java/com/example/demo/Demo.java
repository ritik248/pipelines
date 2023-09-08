package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo{
	@ResponseBody
	@RequestMapping("/")
	public String  demo() {
		return "Hello All Welcome to Phase 5 !!!";
	}
}


