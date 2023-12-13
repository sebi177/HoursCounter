package com.example.hourscounter.mapper;

import com.example.hourscounter.dto.WorkDTO;
import com.example.hourscounter.model.Work;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface WorkMapper {
    WorkDTO toDTO(Work work);
}
