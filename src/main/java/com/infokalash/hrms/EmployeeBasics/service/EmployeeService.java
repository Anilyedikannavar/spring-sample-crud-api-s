package com.infokalash.hrms.EmployeeBasics.service;

import java.util.List;

import com.infokalash.hrms.EmployeeBasics.model.EmployeeBasic;

public interface EmployeeService {
	// Get all Employees in a list
	List<EmployeeBasic> getAllEmployeeBasics();

	// Get-By-Id
	EmployeeBasic getEmployeeBasicById(Long id);

	// post method
	EmployeeBasic createEmployeeBasic(EmployeeBasic employeeBasic);

	// update
	EmployeeBasic updateEmployeeBasic(EmployeeBasic employeeBasic);

	// Delete-By-Id
	void deleteEmployeeBasic(Long id);
}
