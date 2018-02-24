package com.rakesh.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.entity.Course;
import com.rakesh.entity.CourseStream;
import com.rakesh.repository.CourseRepository;
import com.rakesh.repository.CourseStreamRepository;

@RestController
@RequestMapping("/api/course/v1")
public class CourseController {

	@Autowired
	private CourseRepository courseRepo;
	
	@Autowired
	private CourseStreamRepository courseStreamRepo;
	
	@RequestMapping(value= "/courses", method = RequestMethod.GET)
	public Iterable<Course> getAllCourse(){
		return courseRepo.findAll();
	}
	
	@RequestMapping(value = "/course/create", method = RequestMethod.POST)
	public Iterable<Course> createCourse(@RequestBody final Course course){
		courseRepo.save(course);
		return courseRepo.findAll();
	}
	
	@RequestMapping(value= "/courseStreams", method = RequestMethod.GET)
	public Iterable<CourseStream> getAllCourseStream(){
		return courseStreamRepo.findAll();
	}
	
	@RequestMapping(value = "/courseStream/create", method = RequestMethod.POST)
	public Iterable<CourseStream> createCourseStream(@RequestBody final CourseStream courseStream){
		courseStreamRepo.save(courseStream);
		return courseStreamRepo.findAll();
	}
}
