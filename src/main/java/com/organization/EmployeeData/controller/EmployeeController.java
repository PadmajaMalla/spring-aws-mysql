 package com.organization.EmployeeData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.organization.EmployeeData.entity.Employee;
import com.organization.EmployeeData.service.Impl.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl serviceImpl;
	
	@PostMapping(path = "/Employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return serviceImpl.addEmployee(employee);
	}
	
	@GetMapping(path = "/Employee")
	private List<Employee> getEmployees() {
		return serviceImpl.getEmployees();
	}
	
	/*@PutMapping(path = "/Employee/{id}")
	private Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
		return serviceImpl.updateEmployee(id, employee);
	}*/
	
	@PutMapping(path = "/Employee/{id}/{salary}")
	private Employee updateEmployeeSal(@PathVariable("id") Integer id, @PathVariable("salary") Double salary) {
		return serviceImpl.updateEmployeeSal(salary,id);
	}
	
	/*@GetMapping(path = "/salary")
	public List<Employee> function(){
		return serviceImpl.descendingSalary();
	}*/
	
	@GetMapping(path = "/Employee/sorted")
	public List<Employee> function2(){
		return serviceImpl.getEmployeesBySorting();
	}
}
