package com.sunbeam.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString(callSuper = true, exclude = "students")
@Table(name="course")
public class Course {
	
	@Column(name = "id",unique = true)
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	@Column(unique = true)
	@NotBlank
	private String name;
	@Enumerated(EnumType.STRING)
	private CategoryEnum category;
	@NotNull
	@Column(name = "start_date")
	@DateTimeFormat(pattern="YYYY-MM-DD")
	private LocalDate startDate;
	@NotNull
	@Column(name = "end_date")
	@Future
	@DateTimeFormat(pattern="YYYY-MM-DD")
	private LocalDate endDate;
	@NotNull
	private double fees;
	@NotNull
	@Column(name = "passing_marks")
	private double passingMarks;
	@OneToMany(mappedBy = "studentId", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Student> students = new ArrayList<>();
	
	
	
	public void addStudent(Student newStudent)
	{
		this.students.add(newStudent);
		newStudent.setCourseId(this);
	}



	public Course(@NotBlank String name, CategoryEnum category, @NotNull LocalDate startDate,
			@NotNull @Future LocalDate endDate, @NotNull double fees, @NotNull double passingMarks) {
		super();
		this.name = name;
		this.category = category;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fees = fees;
		this.passingMarks = passingMarks;
	}
}
