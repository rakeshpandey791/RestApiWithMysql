package com.rakesh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rakesh.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, String> {

}
