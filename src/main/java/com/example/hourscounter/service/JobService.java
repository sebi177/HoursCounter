package com.example.hourscounter.service;

import com.example.hourscounter.dto.JobDTO;
import com.example.hourscounter.model.Employee;
import com.example.hourscounter.model.Job;
import com.example.hourscounter.model.Work;

import java.util.List;

public interface JobService {
    JobDTO createJob(Job job);

    Double calculatePrice(List<Work> works, List<Employee> workers);
}
