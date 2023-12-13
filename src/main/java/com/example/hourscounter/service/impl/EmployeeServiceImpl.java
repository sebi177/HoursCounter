package com.example.hourscounter.service.impl;

import com.example.hourscounter.dto.EmployeeDTO;
import com.example.hourscounter.mapper.EmployeeMapper;
import com.example.hourscounter.model.Employee;
import com.example.hourscounter.repository.EmployeeRepository;
import com.example.hourscounter.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeMapper employeeMapper;
    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO createEmployee(Employee employee){
        return employeeMapper.toDTO(employeeRepository.save(employee));
    }


}
