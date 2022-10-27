package com.heekwoncompany.study014;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping(value = "login")
	public String login() {
		
		
		
		return "login";
	}
	
	@RequestMapping(value = "loginOk")
	public String loginOk(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("tiger") && pw.equals("12345")) {
			return "redirect:Ok";
		}
		else {
			return "redirect:idNg";
		}
		
	
	}
	
	@RequestMapping(value = "Ok")
	public String idOk() {
		
		return "check/idOk";
	}
	
	@RequestMapping(value = "idNg")
	public String idNg() {
		
		return "check/idNg";
	}
	
	@RequestMapping(value = "test")
	public String test() {
		
		return "redirect:http://naver.com";
//		return "redirect:http://localhost:8888/study014/test.jsp";
	}
	
}
