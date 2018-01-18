package com.springmvc4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringHolaMundo {

	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "Nuevo mensaje";
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/adios")
	public ModelAndView adios() {
 
		String message = "Hasta luego";
		return new ModelAndView("adios", "message", message);
	}
}
