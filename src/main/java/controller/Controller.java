package controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.dto.User;
import spring.service.LoginService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private LoginService loginService;

	@RequestMapping("/loginPage")
	public String loginHandle() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String test(User user){
		if(user != null) {
			boolean login = loginService.select(user);
			if(login == false) {
				return "redirect:loginPage";
			}		
		}return "home";
	}
}
