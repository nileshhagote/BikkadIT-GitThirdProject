package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.serviceI.StudentServiceI;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceI studentServiceI;

}
