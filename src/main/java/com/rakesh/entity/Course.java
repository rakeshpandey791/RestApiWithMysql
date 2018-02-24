package com.rakesh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String courseName;
	private String courseCode;
	private Integer noOfSemester;
	private Integer courseFees;
	private String courseDescription;
	public Integer getNoOfSemester() {
		return noOfSemester;
	}
	public void setNoOfSemester(Integer noOfSemester) {
		this.noOfSemester = noOfSemester;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public Integer getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(Integer courseFees) {
		this.courseFees = courseFees;
	}
	
	
	
}
