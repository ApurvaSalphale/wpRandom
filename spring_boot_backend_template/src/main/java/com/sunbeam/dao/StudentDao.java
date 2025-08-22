package com.sunbeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Course;
import com.sunbeam.entities.Student;

public interface StudentDao extends JpaRepository<Student, Long> {
  
	boolean existByCourseIdAndStudentName(Course course, String string);
}
