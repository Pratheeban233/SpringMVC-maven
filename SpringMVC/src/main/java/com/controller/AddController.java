package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.service.AddService;

@Controller
public class AddController {
		@RequestMapping("/addition")
		public ModelAndView add(@RequestParam("t1") int i, @RequestParam ("t2") int j, HttpServletRequest request,HttpServletResponse response)
		{
			
			//vSystem.out.println("im here");
			//int i=Integer.parseInt(request.getParameter("t1"));
			//int j=Integer.parseInt(request.getParameter("t2"));
			//int k=i+j;
			
			AddService as=new AddService();
			int k=as.calculate(i, j);
			
			ModelAndView mv=new ModelAndView();
			mv.setViewName("addpage");
			mv.addObject("result",k);
			
			return mv;
		}
		
}
