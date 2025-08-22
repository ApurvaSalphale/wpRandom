package com.sunbeam.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ApiResponse {
	private LocalDateTime time;
	private String message;

	public ApiResponse(String message) {
		super();
		this.message = message;
		this.time = LocalDateTime.now();
	}

}
