package com.infokalash.hrms.EmployeeBasics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infokalash.hrms.EmployeeBasics.model.EmployeeBasic;
import com.infokalash.hrms.EmployeeBasics.repository.EmployeeBasicRepository;

@Service
public class EmployeeBasicServiceImpl implements EmployeeService {
	private final EmployeeBasicRepository employeeBasicRepository;

	@Autowired
	public EmployeeBasicServiceImpl(EmployeeBasicRepository employeeBasicRepository) {
		this.employeeBasicRepository = employeeBasicRepository;
	}

	// Method to get ALL Employees in a list

	@Override
	public List<EmployeeBasic> getAllEmployeeBasics() {
		return employeeBasicRepository.findAll();
	}

	@Override
	public EmployeeBasic getEmployeeBasicById(Long id) {
		return employeeBasicRepository.findById(id).orElse(null);
	}

//post method
	@Override
	public EmployeeBasic createEmployeeBasic(EmployeeBasic employeeBasic) {
		// I can write anything
		return employeeBasicRepository.save(employeeBasic);
	}

	@Override
	public EmployeeBasic updateEmployeeBasic(EmployeeBasic employeeBasic) {
		return employeeBasicRepository.save(employeeBasic);
	}

	@Override
	public void deleteEmployeeBasic(Long id) {
		employeeBasicRepository.deleteById(id);
	}
}
