package com.example.hourscounter.service.impl;

import com.example.hourscounter.exception.ErrorMessage;
import com.example.hourscounter.dto.EmployeeDTO;
import com.example.hourscounter.exception.NotFoundException;
import com.example.hourscounter.mapper.EmployeeMapper;
import com.example.hourscounter.model.Employee;
import com.example.hourscounter.repository.EmployeeRepository;
import com.example.hourscounter.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeMapper employeeMapper;
    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO createEmployee(Employee employee){
        return employeeMapper.toDTO(employeeRepository.save(employee));
    }

    @Override
    public EmployeeDTO findEmployeeDtoById(String id) {
        return employeeMapper.toDTO(employeeRepository.findById(UUID.fromString(id))
                .orElseThrow(() -> new NotFoundException(ErrorMessage.DATA_NOT_FOUND)));
    }


}
