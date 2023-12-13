package com.example.hourscounter.mapper;

import com.example.hourscounter.dto.EmployeeDTO;
import com.example.hourscounter.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface EmployeeMapper {

    EmployeeDTO toDTO(Employee employee);


}
