package sy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sy.model.User;
import sy.service.UserServiceI;

@Controller
@RequestMapping("/userController")
public class UserController {
	
	private UserServiceI userService;
	

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}


	/*
	@RequestMapping("/showAccount/{id}")
	public String showAccount(@PathVariable int id,HttpServletRequest request){
		Account account = accountservice.getAccountById(id);
		request.setAttribute("account", account);
		return "showAccount";
	}*/
	@RequestMapping("/showUser")
	public String showAccount(String id,HttpServletRequest request){
		User user = userService.getUserById(id);
		request.setAttribute("user", user);
		return "showUser";
	}
}
