package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import test.service.TestService;

@Controller
public class TestController {
	@Autowired
	TestService testService;
	
	@RequestMapping(value="/test")
	public String initController() {
		testService.doService();
		return "test";
	}
}
