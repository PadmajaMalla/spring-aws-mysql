package com.organization.EmployeeData.service;

import java.util.List;

import com.organization.EmployeeData.entity.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee employee);
	public List<Employee> getEmployees();
	//public Employee updateEmployee(Integer id, Employee employee);
	
	//public List<Employee> descendingSalary();
	public List<Employee> getEmployeesBySorting();
	public Employee updateEmployeeSal(Double salary, Integer id);
}
