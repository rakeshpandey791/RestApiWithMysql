package com.rakesh.repository;

import java.util.List;

import javax.persistence.ColumnResult;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rakesh.entity.Student;
import com.rakesh.entity.Course;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	//@Query("select s.id,s.name,s.email,s.mobile,c.courseName,c.courseCode from Student s inner join s.Course c on s.courseId=c.id where s.courseId=:courseId")
	//@Query("select id,name,email,mobile from Student where courseId=:courseId")
	
	//@Query(value = "select id,name,email,mobile from Student where courseId=:courseId", nativeQuery = true)
	List<Student> findStudentByCourseId(@Param("courseId") Integer courseId);

}
