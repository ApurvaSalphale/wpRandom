package com.sunbeam.service;

import java.util.List;

import com.sunbeam.dto.ApiResponse;
import com.sunbeam.dto.CourseDTO;
import com.sunbeam.dto.UpdateCourseDTO;
import com.sunbeam.entities.CategoryEnum;
import com.sunbeam.entities.Course;

import jakarta.validation.Valid;

public interface CourseService {

	ApiResponse addCourse(CourseDTO newCourse);

	ApiResponse updateCourse(Long courseId, @Valid UpdateCourseDTO updatedCourse);

	List<CourseDTO> getList(CategoryEnum categoryEnum);
}
