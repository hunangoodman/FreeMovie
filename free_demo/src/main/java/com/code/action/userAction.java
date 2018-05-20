package com.code.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.bean.User;
import com.code.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class userAction {
	@Autowired
	UserServiceImpl userService;
	@PostMapping("/doLogin/{User}")
	public User doLogin(@PathVariable User user){
		return userService.findModel(user);
	}
	
	@GetMapping("toLoginView")
	public String toLoginView(){
		System.out.println("here come...");
		return "user/login";
	}
}
