package com.BikkadIT.SpringMvcFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/message")
	public ModelAndView welcomMsg() {
		String msg = "Welcome to BikkadIT Welcome Controller";

		ModelAndView mav = new ModelAndView();
		mav.addObject("MSG", msg);
		mav.setViewName("welcome");
		return mav;

	}
}