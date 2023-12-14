package com.example.hourscounter.service.impl;

import com.example.hourscounter.dto.WorkDTO;
import com.example.hourscounter.mapper.WorkMapper;
import com.example.hourscounter.model.Work;
import com.example.hourscounter.model.enums.JobType;
import com.example.hourscounter.repository.WorkRepository;
import com.example.hourscounter.service.WorkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkServiceImpl implements WorkService {

    private final WorkMapper workMapper;
    private final WorkRepository workRepository;

    @Override
    public WorkDTO createWork(Work work) {
        return workMapper.toDTO(workRepository.save(work));
    }

    @Override
    public Double calculatePrice(JobType jobType, double area) {
        return jobType.getPriceProQM() * area;
    }
}
