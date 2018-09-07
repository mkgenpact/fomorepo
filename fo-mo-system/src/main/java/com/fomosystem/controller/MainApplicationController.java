package com.fomosystem.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fomosystem.model.FoModel;
import com.fomosystem.model.MoModel;

@Controller
public class MainApplicationController {
	
	@RequestMapping("/loadFoPage")
	public ModelAndView loadFoPage(HttpServletRequest request,Map<String, Object> model) {
		
		return new ModelAndView("fopage", "command", new FoModel());
	}
	
	@RequestMapping("/loadMoPage")
	public ModelAndView loadMoPage(HttpServletRequest request,Map<String, Object> model) {
		
		 return new ModelAndView("mopage", "command", new MoModel());
	}

}
