package com.asshead.SpringBootMybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asshead.SpringBootMybatis.service.UserService;
import com.asshead.SpringBootMybatis.entity.User;

@Controller
public class UserController {
	

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/dologin")
	public String dologin(User user,Model model){
		User userd = userService.selectUser(user);
		
		if(userd == null){
			model.addAttribute("msg", "用户名或者密码错误！！");
			return "fail";
		}else {
			model.addAttribute("msg", "登录成功！！！");
			return "success";
		}
	}
	

}
