package com.heekwoncompany.study014;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IdController {

	@RequestMapping(value ="/index")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value ="/student", method = RequestMethod.POST)
	public String student(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		model.addAttribute("id", id);
		
		
		return "studentIdView";
	}
}
