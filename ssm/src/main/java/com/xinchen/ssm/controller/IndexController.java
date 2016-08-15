package com.xinchen.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@RequestMapping("/test")
	public String test(){
		return "test";	
	}
	
	@RequestMapping("/modal")
	public String modal(){
		return "modal";	
	}
	
	@RequestMapping("/jquery-form")
	@ResponseBody
	public Model jq_from(Model model,String name,String password,String param1){
		model.addAttribute("name",name);
		model.addAttribute("password",password);
		model.addAttribute("param1", param1);
		return model;	
	}
	
}
