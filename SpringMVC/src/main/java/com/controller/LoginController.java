package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.service.LoginService;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req,HttpServletResponse res)

	//public ModelAndView login(@RequestParam("t1") String uname,@RequestParam("t2") String pass,HttpServletRequest req,HttpServletResponse res)
	{	
		//System.out.println("login page 1");
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
			ModelAndView mv=new ModelAndView();
		/*LoginService ls=new LoginService();
		if(ls.check(uname,pass))*/
			
		if(uname.equals("Prathi")&&pass.equals("12345"))
		{
			mv.setViewName("loginsuccess");
		}
		else
		{
			mv.setViewName("loginfail");
		}
		//System.out.println("login page 2");

		return mv;
		
	}

}
