package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
