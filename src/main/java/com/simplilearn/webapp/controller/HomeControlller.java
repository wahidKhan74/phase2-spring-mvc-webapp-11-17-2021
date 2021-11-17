package com.simplilearn.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeControlller {

	@RequestMapping("/status")
	public ModelAndView indexMapper() {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("data", "Spring MVC Server");
		mv.addObject("message", "Server is up & running !");
		return mv;
	}
}
