package com.rest.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.employee.model.Employee;
import com.rest.employee.repository.EmployeeRepository;
import com.rest.employee.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.getAllEmployee();
	}

}
