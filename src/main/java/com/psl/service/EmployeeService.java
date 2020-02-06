package com.psl.service;

import java.util.List;
import java.util.Optional;

import com.psl.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Optional<Employee> getEmployeeById(long id);

}
