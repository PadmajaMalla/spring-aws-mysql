package com.organization.EmployeeData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.organization.EmployeeData.entity.Employee;
 

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByOrderBySalaryDesc();
}