package com.example.hourscounter.service;

import com.example.hourscounter.dto.EmployeeDTO;
import com.example.hourscounter.model.Employee;

public interface EmployeeService {
    EmployeeDTO createEmployee(Employee employee);
}
