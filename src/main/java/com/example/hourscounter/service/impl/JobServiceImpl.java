package com.example.hourscounter.service.impl;

import com.example.hourscounter.dto.JobDTO;
import com.example.hourscounter.mapper.JobMapper;
import com.example.hourscounter.model.Employee;
import com.example.hourscounter.model.Job;
import com.example.hourscounter.model.Work;
import com.example.hourscounter.repository.JobRepository;
import com.example.hourscounter.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {
    private final JobMapper jobMapper;
    private final JobRepository jobRepository;

    @Override
    public JobDTO createJob(Job job){
        return jobMapper.toDTO(jobRepository.save(job));
    }

    public Double calculatePrice(List<Work> works, List<Employee> workers){
        Double money = 0.0;
        for (int i = 0; i < works.size(); i++) {
            Work work = works.get(i);
            money+=work.getPrice();
        }
        return money / workers.size();
    }

}
