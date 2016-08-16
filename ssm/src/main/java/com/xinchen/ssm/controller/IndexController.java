package com.xinchen.ssm.controller;

import java.io.IOException;

import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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
	
	@RequestMapping("/jtest")
	public String jtest(){
		return "jtest";	
	}
	
	@RequestMapping("/jquery-form")

	public Model jq_from(Model model,String name,String password,String param1){
		model.addAttribute("name",name);
		model.addAttribute("password",password);
		model.addAttribute("param1", param1);
		return model;	
	}
	
	/**
	 * ajax传值
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/jtest/ajax") 
	@ResponseBody
    public  Map<String,Object> login(HttpServletRequest request,HttpServletResponse response) throws IOException{  
        System.out.println(request.getParameter("name"));  
        Map<String,Object> map = new HashMap<String,Object>();  
          
        if(request.getParameter("name").equals("123")){  
            System.out.println("成功");  
            map.put("msg", "成功");  
        }else{  
            System.out.println("失败");  
            map.put("msg", "失败");  
        }  
        return map;  
    }  
	

	
}
