package com.example.hourscounter.service;

import com.example.hourscounter.dto.EmployeeDTO;
import com.example.hourscounter.dto.EmployeeToCreateDTO;
import com.example.hourscounter.model.Employee;

public interface EmployeeService {

    EmployeeDTO createEmployee(EmployeeToCreateDTO employeeDTO);

    EmployeeDTO findEmployeeDtoById(String id);
}
