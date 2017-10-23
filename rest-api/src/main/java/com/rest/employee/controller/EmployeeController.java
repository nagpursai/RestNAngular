package com.rest.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.employee.model.Employee;
import com.rest.employee.repository.EmployeeRepository;
import com.rest.employee.service.EmployeeService;

@RestController
@RequestMapping("/emps")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@RequestMapping(value="/details",method=RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmployeeDetails() {
		List<Employee> employeeList = employeeService.getAllEmployee();
		return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
	}

}
