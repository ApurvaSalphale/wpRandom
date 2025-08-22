package com.sunbeam.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.CourseDao;
import com.sunbeam.dao.StudentDao;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.dto.StudentDTO;
import com.sunbeam.entities.Course;
import com.sunbeam.entities.Student;
import com.sunbeam.custom_exception.InputInvalidException;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

	private final StudentDao studentDao;
	private final CourseDao courseDao;
	private final ModelMapper modelMapper;

	@Override
	public ApiResponse addStudent(Long courseId, StudentDTO newStudent) {
		Course course = courseDao.findById(courseId)
				.orElseThrow(() -> new InputInvalidException("Invalid course id!!"));

		if (studentDao.existByCourseIdAndStudentName(course, newStudent.getStudentName()))
			throw new InputInvalidException("Student Already Exists");

		course.addStudent(modelMapper.map(newStudent, Student.class));
		return new ApiResponse("Student added successfully");
	}

}
