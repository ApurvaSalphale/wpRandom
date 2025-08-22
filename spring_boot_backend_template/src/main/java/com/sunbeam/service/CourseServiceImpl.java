package com.sunbeam.service;

import java.util.List;

import org.modelmapper.ModelMapper;

import com.sunbeam.dao.CourseDao;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.dto.CourseDTO;
import com.sunbeam.dto.UpdateCourseDTO;
import com.sunbeam.entities.CategoryEnum;

import jakarta.validation.Valid;

public class CourseServiceImpl implements CourseService{
	private final CourseDao courseDao;
	private final ModelMapper modelMapper;
	
	@Override
	public ApiResponse addCourse(CourseDTO newCourse) {
		if(CourseDao.existsByName(newCourse.getName()))
			throw new InvalidInputException("Course Already exists!!!");
		
		Course persistentCourse = courseDao.save(modelMapper.map(newCourse,Course.class));
		return new ApiResponse("Course Added Successfully with ID "+persistentCourse.getID());
	}

	@Override
	public ApiResponse updateCourse(Long courseId, @Valid UpdateCourseDTO updatedCourse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseDTO> getList(CategoryEnum categoryEnum) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

