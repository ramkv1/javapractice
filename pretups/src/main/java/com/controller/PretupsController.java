package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Employee;
import com.repo.EmployeeRepo;

@RestController
@RequestMapping("/pretups/v1")
public class PretupsController {
	
	@Autowired
	private EmployeeRepo repo;
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployeeName(){
		
	
		
		return 	repo.findAll();
	}

}










