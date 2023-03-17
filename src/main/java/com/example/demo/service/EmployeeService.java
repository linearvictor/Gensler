package com.example.demo.service;

import java.util.List;

import com.example.demo.entites.Employee;

public interface EmployeeService {
	
	String upsert(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployee(Integer id);
	String deleteById(Integer id);

	}
