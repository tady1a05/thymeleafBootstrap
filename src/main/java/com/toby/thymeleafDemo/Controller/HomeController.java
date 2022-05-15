package com.toby.thymeleafDemo.Controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.annotation.PostConstruct;
import com.toby.thymeleafDemo.Entity.*;

@Controller
public class HomeController {
	public ArrayList<Employee> employees;
	
	@PostConstruct
	public void loadData() {
		employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Toby","Cheung","TobyCheung@gmail.com"));
		employees.add(new Employee("Tony","Cheng","TonyCheng@gmail.com"));
		employees.add(new Employee("Kitty","Pun","KittyPun@gmail.com"));

	}
	
	@RequestMapping("/demo")
	public String demo(Model model) {
		model.addAttribute("employees", employees);
		return "Demo";
	}
}
