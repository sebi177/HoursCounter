package com.example.hourscounter.service;

import com.example.hourscounter.dto.JobDTO;
import com.example.hourscounter.model.Job;

public interface JobService {
    JobDTO createJob(Job job);
}
