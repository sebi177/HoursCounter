package com.example.hourscounter.service;

import com.example.hourscounter.dto.WorkDTO;
import com.example.hourscounter.model.Work;
import com.example.hourscounter.model.enums.JobType;

public interface WorkService {
    WorkDTO createWork(Work work);

    Double calculatePrice(JobType jobType, double area);
}
