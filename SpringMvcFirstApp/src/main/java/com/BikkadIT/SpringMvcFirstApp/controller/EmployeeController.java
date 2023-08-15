
package com.BikkadIT.SpringMvcFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/welcomeEmployee")
	public String welcomeEmp(Model model) {

		String msg = "Hii shweta Welcome to BikkadIT";
		model.addAttribute("MESSAGE", msg);
		return "welEmp";

	}

}
