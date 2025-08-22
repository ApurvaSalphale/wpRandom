package com.sunbeam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dto.StudentDTO;
import com.sunbeam.service.StudentService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {
	private final StudentService studentService;

	@PostMapping("/{courseId}")
	public ResponseEntity<?> addStudent(@Valid @PathVariable Long courseId, @RequestBody StudentDTO newStudent) {
		System.out.println("Add student in course");
		return ResponseEntity.status(HttpStatus.CREATED).body(studentService.addStudent(courseId, newStudent));

	}

}
