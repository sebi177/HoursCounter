package com.example.hourscounter.controller;

import com.example.hourscounter.dto.EmployeeDTO;
import com.example.hourscounter.dto.EmployeeToCreateDTO;
import com.example.hourscounter.model.Employee;
import com.example.hourscounter.service.EmployeeService;
import com.example.hourscounter.validate.annotation.ValidUUID;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/account")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/get/by-id")
    public EmployeeDTO getEmployeeDtoById(@ValidUUID @Param("id") String id) {
        return employeeService.findEmployeeDtoById(id);
    }

    @PostMapping("/create")
    public EmployeeDTO createEmployee(EmployeeToCreateDTO employee){
        return employeeService.createEmployee(employee);
    }

}
