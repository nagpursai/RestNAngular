package com.rest.employee.repository;

import java.util.List;

import com.rest.employee.model.Employee;

public interface EmployeeRepository{

	/** 
	 * Get List of ReportCategory and Sub Category based on UserId
	 * @param userId
	 * @return
	 */
	public List<Employee> getAllEmployee();
}