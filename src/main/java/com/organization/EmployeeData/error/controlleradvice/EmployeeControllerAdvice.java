package com.organization.EmployeeData.error.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.organization.EmployeeData.error.EmpAlreadyExistsException;

@ControllerAdvice
public class EmployeeControllerAdvice {
	
	@ExceptionHandler(EmpAlreadyExistsException.class)
	public ResponseEntity<String> handleEmpAlreadyExistsException(EmpAlreadyExistsException empAlreadyExistsException){
		return new ResponseEntity<String>("Employee already exists in the database", HttpStatus.BAD_REQUEST);
	}
}

