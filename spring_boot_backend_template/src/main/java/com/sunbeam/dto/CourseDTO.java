package com.sunbeam.dto;

import java.time.LocalDateTime;

import com.sunbeam.entities.CategoryEnum;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CourseDTO {
	private String name;

	private CategoryEnum category;

	private LocalDateTime startDate;

	private LocalDateTime endDate;

	private double fees;

	private double passingMarks;
}
