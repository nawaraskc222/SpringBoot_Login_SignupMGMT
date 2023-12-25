package com.LoginApp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
//	DemoSpring
	@Autowired
	LoginRepository repo;
	
	@GetMapping("/Login")
		public String login(Model model) {
					
		return "Login.jsp";			
	}
	
	@PostMapping("/addCustomer")
	public String anotherPage(@RequestParam String username,@RequestParam String password) {		
		Login l= new Login();
		l.setUsername(username);
		l.setPassword(password);
		repo.save(l);	

		return "Success.jsp";
	}
		
	 

}
