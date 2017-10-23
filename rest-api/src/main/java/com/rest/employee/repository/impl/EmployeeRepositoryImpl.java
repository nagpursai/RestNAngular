package com.rest.employee.repository.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rest.employee.mapper.EmployeeMapper;
import com.rest.employee.model.Employee;
import com.rest.employee.repository.EmployeeRepository;
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

	private static final Logger logger = LoggerFactory
			.getLogger(EmployeeRepositoryImpl.class);
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public EmployeeRepositoryImpl(JdbcTemplate jdbc) {
		jdbcTemplate = jdbc;
	}
	
	private final String getAllEmpQuery = "SELECT EMP_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE FROM EMPLOYEE";
	
	@Override
	public List<Employee> getAllEmployee() {
		logger.debug(this.getClass().getName()
				+ " - getReportByReportId - START");
		
		List<Employee> empList = jdbcTemplate.query(getAllEmpQuery, new EmployeeMapper());
		
		logger.debug(this.getClass().getName()
				+ " - getReportByReportId - END");
		return empList;
	}
	
}
