package com.organization.EmployeeData.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.organization.EmployeeData.entity.Employee;
import com.organization.EmployeeData.error.EmpAlreadyExistsException;
import com.organization.EmployeeData.repository.EmployeeRepository;
import com.organization.EmployeeData.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		if(empRepo.existsById(employee.getId())) {
			throw new EmpAlreadyExistsException("Employee already exists in the database");
		}
		return empRepo.save(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		return empRepo.findAll();
	}

	/*@Override
	public Employee updateEmployee(Integer id, Employee employee) {
		
		Employee employee2 = empRepo.findById(id).get();
		
		if(0 < employee.getSalary()) {
			employee2.setSalary(employee.getSalary());
		}
		
		return empRepo.save(employee2);
	}
	
	@Override
	public List<Employee> descendingSalary() {
		return empRepo.findByOrderBySalaryDesc();
	}*/

	@Override
	public List<Employee> getEmployeesBySorting() {
		List<Employee> list = empRepo.findAll(Sort.by("salary").descending().and(Sort.by("name")));
		return list;
	}

	public Employee updateEmployeeSal(Double salary, Integer id) {
		Employee emp = empRepo.findById(id).get();
		emp.setSalary(salary);
		return empRepo.save(emp);
	}
}
