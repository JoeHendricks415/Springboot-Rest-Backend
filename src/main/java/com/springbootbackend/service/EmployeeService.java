package com.springbootbackend.service;

import com.springbootbackend.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long Id);
    Employee updateEmployee(Employee employee, Long id);

    void deleteEmployee(Long id);
}
