package com.example.hourscounter.mapper;

import com.example.hourscounter.dto.JobDTO;
import com.example.hourscounter.dto.JobDoneDTO;
import com.example.hourscounter.dto.JobToDoDTO;
import com.example.hourscounter.model.Job;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface JobMapper {

    JobDTO toDTO(Job job);

    Job toEntity(JobToDoDTO job);

    JobDoneDTO todto(Job job);
}
