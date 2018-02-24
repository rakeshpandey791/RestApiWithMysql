package com.rakesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.entity.Student;
import com.rakesh.repository.StudentRepository;

@RestController
@RequestMapping("/api/student/v1")
public class StudentController {

	@Autowired
	private StudentRepository studentRepo;
	
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> getAllStudent(){
		return studentRepo.findAll();
	}
	
	@RequestMapping(value = "/student/create", method = RequestMethod.POST)
	public List<Student> createStudent(@RequestBody final Student student){
		studentRepo.save(student);
		return studentRepo.findAll();
	}
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable(value="id") final Integer id){
	    return studentRepo.findOne(id);
	}
	
	@RequestMapping(value = "/student/courseId/{courseId}", method = RequestMethod.GET)
	public List<Student> getStudentByCourseId(@PathVariable(value="courseId") final Integer courseId){
		List<Student> stds = studentRepo.findStudentByCourseId(courseId);
		return stds;
	}
}
