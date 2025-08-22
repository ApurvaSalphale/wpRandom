package com.sunbeam.service;

import com.sunbeam.dto.ApiResponse;
import com.sunbeam.dto.StudentDTO;

public interface StudentService {
           ApiResponse addStudent(Long courseId,StudentDTO newStudent);
}
