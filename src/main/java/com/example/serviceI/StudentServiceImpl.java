package com.example.serviceI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Student;
import com.example.repositiory.StudentRepository;


public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
	Student	save=studentRepository.save(student); 
		
		return save.getStudentId();
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> findAll=studentRepository.findAll();
		return findAll;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Student findById=studentRepository.findById(id).get();
		return findById;
	}

}
