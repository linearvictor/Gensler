package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public String upsert(Employee emp) {
		repo.save(emp);
		return "Success";
	}

	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}

	public Employee getEmployee(Integer id) {
		Optional<Employee> findById = repo.findById(id);
		return findById.get();
	}
	
	
	public String deleteById(Integer id) {
		repo.deleteById(id);
		return null;
	}

	
}
