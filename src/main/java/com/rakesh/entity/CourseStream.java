package com.rakesh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CourseStream {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String streamName;
	private String streamCode;
	private String streamDescription;
	
	@OneToOne
	@JoinColumn(name = "courseId", referencedColumnName = "id")
	private Course course;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStreamName() {
		return streamName;
	}
	public void setStreamName(String streamName) {
		this.streamName = streamName;
	}
	public String getStreamCode() {
		return streamCode;
	}
	public void setStreamCode(String streamCode) {
		this.streamCode = streamCode;
	}
	public String getStreamDescription() {
		return streamDescription;
	}
	public void setStreamDescription(String streamDescription) {
		this.streamDescription = streamDescription;
	}
	
	
	
}
