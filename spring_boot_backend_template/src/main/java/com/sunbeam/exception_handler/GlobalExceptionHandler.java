//package com.sunbeam.exception_handler;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import io.swagger.v3.oas.models.responses.ApiResponse;
//
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//	@ExceptionHandler(RuntimeException.class)
//	public ResponseEntity<?> handleRuntimeException1(Exception e)
//	{
//		System.out.println("In catch all");
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse(e.getMessage()));
//	}
//	
//	@ExceptionHandler()
//	public ResponseEntity<?> handleInvalidInputException(Exception e)
//	{
//		System.out.println("In catch all");
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(e.getMessage()));
//	}
//	
//	@ExceptionHandler(RuntimeException.class)
//	public ResponseEntity<?> handleRuntimeException(Exception e)
//	{
//		System.out.println("In catch all");
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse(e.getMessage()));
//	}
//	
//	@ExceptionHandler(RuntimeException.class)
//	public ResponseEntity<?> handleRuntimeException(Exception e)
//	{
//		System.out.println("In catch all");
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse(e.getMessage()));
//	}
//}
