package com.rakesh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String email;
	private String mobile;
	
	@OneToOne
	@JoinColumn(name = "courseId", referencedColumnName="id")
	private Course course;
	
	
	@OneToOne
	@JoinColumn(name = "courseStreamId", referencedColumnName = "id")
	private CourseStream courseStream;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public CourseStream getCourseStream() {
		return courseStream;
	}
	public void setCourseStream(CourseStream courseStream) {
		this.courseStream = courseStream;
	}
	
	
	
	
	
}
