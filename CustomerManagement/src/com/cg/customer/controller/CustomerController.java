package com.cg.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.customer.bean.CustomerBean;
import com.cg.customer.service.CustomerService;



@Controller
public class CustomerController 
{
	@Autowired
	CustomerService service;
	@RequestMapping("/start")
	public String start()
	{
		System.out.println("start");
		return "CustomerRegForm";
	}
	@RequestMapping("/regform")
	public ModelAndView register(CustomerBean cust)
	{
		System.out.println("controller111");
		service.addCustomer(cust);
		return new ModelAndView("CustomerSuccess","k",cust);
		
		
	}
	
	
	
	

}
