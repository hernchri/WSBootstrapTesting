package com.hernchri.wsbootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	private final String JSP = "/WEB-INF/jsp/";
	
	@RequestMapping("/index")
	public String index(){
		return JSP + "index.jsp";
	}

}
