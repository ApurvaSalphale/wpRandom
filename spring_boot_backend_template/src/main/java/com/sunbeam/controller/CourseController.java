package com.sunbeam.controller;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sunbeam.dto.CourseDTO;
import com.sunbeam.dto.UpdateCourseDTO;
import com.sunbeam.entities.CategoryEnum;
import com.sunbeam.service.CourseService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/course")
@AllArgsConstructor
@CrossOrigin(origins ="http://localhost:8080/")
public class CourseController {

  

	private final CourseService courseService;

	@PostMapping("/add")
	public ResponseEntity<?> addCourse(@RequestBody @Valid CourseDTO newCourse)
	{
		System.out.println("Add course");
		return ResponseEntity.status(HttpStatus.CREATED).body(courseService.addCourse(newCourse));
	}
	
	@PutMapping("/{courseId}")
	public ResponseEntity<?> updateCourse(@RequestBody @Valid UpdateCourseDTO updatedCourse, @PathVariable Long courseId )
	{
		System.out.println("in update course");
		return ResponseEntity.ok(courseService.updateCourse(courseId,updatedCourse));
	}
	
	@GetMapping("/{categoryEnum}")
	public ResponseEntity<?> getList(@PathVariable CategoryEnum categoryEnum)
	{
		System.out.println("Get list ");
		return ResponseEntity.ok(courseService.getList(categoryEnum));
	}
}
