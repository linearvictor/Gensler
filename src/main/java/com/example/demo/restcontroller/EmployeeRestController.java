package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Employee;
import com.example.demo.service.EmployeeService;



@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/employee")
	public ResponseEntity<String> employee (@RequestBody Employee employee){
		String status = service.upsert(employee);		
		return new ResponseEntity<>(status, HttpStatus.CREATED); 
		}

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> allEmployee = service.getAllEmployee(); 
		return new ResponseEntity<>(allEmployee, HttpStatus.OK); 
		}

	@GetMapping("/emp/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){
		Employee employee = service.getEmployee(id);
		return new ResponseEntity<>(employee , HttpStatus.OK); 
		}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer id){
		String delete = service.deleteById(id);
		return new ResponseEntity<>(delete, HttpStatus.OK); 
		}


}
