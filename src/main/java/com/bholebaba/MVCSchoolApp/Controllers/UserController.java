package com.bholebaba.MVCSchoolApp.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bholebaba.MVCSchoolApp.entities.Students;
import com.bholebaba.MVCSchoolApp.repositories.StudentsRepository;

@Controller
public class UserController {
	
	@Autowired
	public StudentsRepository studentsRepo;

	
	@RequestMapping(value="/myschool",method=RequestMethod.GET)
	public String homepage() {
		return "welcome";
	}
	
	@RequestMapping(value="/myschool/signup",method=RequestMethod.GET)
	public String fetchSignupPage(@ModelAttribute("students") Students students, BindingResult result) {
		return "signup";
	}
	
	@RequestMapping(value="/myschool/login",method=RequestMethod.GET)
	public String login(String admnnumber, String password) {
		return "login";
	}
	
	
	@RequestMapping(value="/myschool/signup",method=RequestMethod.POST)
	public ModelAndView signUpUser(@ModelAttribute("students") Students students, BindingResult result) {
		studentsRepo.save(students);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
	
	@RequestMapping(value="/myschool/login",method=RequestMethod.POST)
	public ModelAndView loginUser(String admnnumber, String password) {
		ModelAndView mav = new ModelAndView();
		int admissionNumber = Integer.parseInt(admnnumber);
		Optional<Students> student = studentsRepo.findById(admissionNumber);
		if(!student.isPresent()) {
			System.out.println("Student " + admissionNumber + " is not registered");
			mav.setViewName("failedlogin");
		} else if (student.isPresent() && password.equals(student.get().getPassword())){
			System.out.println("Student " + admissionNumber + " is present");
			mav.setViewName("studentdashboard");
		} else {
			System.out.println("Incorrect password entered");
			mav.setViewName("failedlogin");
		}
		
	
		
		return mav;
	}
}
