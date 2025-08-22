package com.sunbeam.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString(callSuper = true , exclude = "courseId")
@Table(name="students", uniqueConstraints = @UniqueConstraint(columnNames = 
{"student_id","id"}))
public class Student {
	
	 @Column(name="student_id",unique = true)
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long studentId;
	 
	 
     @Column(name="student_name")
     @NotBlank
     private String studentName;
     
     @NotBlank
     @Email
     @Column(unique = true)
     private String email;
     
     
     @NotBlank
     @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[@#$*].{5,20})")
     private String password;
     
     
     @NotNull
     private double marks;
     
     
     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "course_id")
     private Course courseId;


	public Student(@NotBlank String studentName, @NotBlank @Email String email,
			@NotBlank @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[@#$*].{5,20})") String password,
			@NotNull double marks) {
		super();
		this.studentName = studentName;
		this.email = email;
		this.password = password;
		this.marks = marks;
	}


	
     
     
     
}
