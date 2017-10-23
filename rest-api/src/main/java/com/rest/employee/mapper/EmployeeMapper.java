package com.rest.employee.mapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rest.employee.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {
	public enum employeeCols {
		EMP_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE
	}

	private ResultSetMetaData columnMetaData = null;

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		if (columnMetaData == null) {
			columnMetaData = rs.getMetaData();
		}
		if (columnMetaData != null) {
			for (int i = 1; i <= columnMetaData.getColumnCount(); i++) {
				String colName = columnMetaData.getColumnName(i);

				switch (employeeCols.valueOf(colName.toUpperCase())) {
				case EMP_ID:
					emp.setEmpId(rs.getLong(colName));
					break;
				case FIRST_NAME:
					emp.setFirstName(rs.getString(colName));
					break;
				case LAST_NAME:
					emp.setLastName(rs.getString(colName));
					break;
				case EMAIL:
					emp.setEmail(rs.getString(colName));
					break;
				case PHONE:
					emp.setPhone(rs.getString(colName));
					break;
				default:
					break;
				}
			}

		}
		return emp;
	}
}
