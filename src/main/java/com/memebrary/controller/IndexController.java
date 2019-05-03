package com.memebrary.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class IndexController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Welcome to memebrary!";
	}
}