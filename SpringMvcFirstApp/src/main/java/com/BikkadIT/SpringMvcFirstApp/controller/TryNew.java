package com.BikkadIT.SpringMvcFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class TryNew {

	@GetMapping("/print")
	public ModelAndView msg() {
		String moo="TRY NEW";
		ModelAndView mav=new ModelAndView();
		mav.addObject("MOO", moo);
		mav.setViewName("trynew");
		return mav;
		
	}
}
