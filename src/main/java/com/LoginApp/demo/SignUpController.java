package com.LoginApp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {
	
	
	@Autowired
	SignUpRepository repo;
	
	@GetMapping("/Signup")
    public String signup() {
        return "Signup.jsp"; // Updated to match the Thymeleaf template name
    }
	
	@PostMapping("/addSignup")
	public String anotherPage(@RequestParam String fname,@RequestParam String email,
			@RequestParam String number,@RequestParam String country,
			@RequestParam String password) {		
		
		SignUp s= new SignUp();
		s.setCountry(country);
		s.setFname(fname);
		s.setPassword(password);
		s.setEmail(email);
		s.setNumber(number);
		repo.save(s);
		
		

		return "Success.jsp";
	}
	

}
