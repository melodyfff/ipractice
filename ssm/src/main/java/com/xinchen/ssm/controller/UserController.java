package com.xinchen.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xinchen.ssm.entity.User;
import com.xinchen.ssm.service.UserService;

/**   
* @Description: 
* @author xinchen  
* @date 2016年8月14日 下午7:13:20   
*/
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showUser")
	public String showUser(Model model){
		List<User> users = userService.loadUsers();
		model.addAttribute("users",users);
		/*List<User> users2 = userService.loadUsers2();
		model.addAttribute("users2",users2);*/
		return "showuser";
	}
}
