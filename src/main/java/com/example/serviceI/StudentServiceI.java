package com.example.serviceI;

import java.util.List;

import com.example.model.Student;



public interface StudentServiceI {
	
	public int addStudent(Student student) ;
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(int id);
	
	

}
