package com.xinchen.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinchen.mvc.model.Person;

/**
 * @Description:
 * @author xinchen 2016年10月16日 上午1:53:26
 */
@Controller
// @RequestMapping("/mvc")
public class IndexController {
	private static final Log log = LogFactory.getLog(IndexControllerTest.class);

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/person")
	public String toPerson(String name, double age) {
		log.info(name + " " + age);
		return "hello";
	}

	@RequestMapping("/person1")
	public String toPerson1(Person p) {
		log.info(p.getName() + " " + p.getAge());
		return "hello";
	}

	// the parameter was converted in initBinder
	@RequestMapping("/date")
	@ResponseBody
	public String date(HttpServletRequest request) {
		
		log.info(request.getAttribute("date"));
		return "hello";
	}
	// At the time of initialization,convert the type "String" to type "date"
	 @InitBinder 
	 public void initBinder(ServletRequestDataBinder binder){
	 binder.registerCustomEditor(Date.class, new CustomDateEditor(new
	 SimpleDateFormat("yyyy-MM-dd"), true));
	 }

}
