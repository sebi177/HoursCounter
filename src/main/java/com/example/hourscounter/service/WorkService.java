package com.example.hourscounter.service;

import com.example.hourscounter.dto.WorkDTO;
import com.example.hourscounter.dto.WorkDoneDTO;
import com.example.hourscounter.model.Work;
import com.example.hourscounter.model.enums.JobType;

public interface WorkService {
    WorkDTO createWork(Work work);

    WorkDoneDTO doneWork(WorkDTO workDTO);

    Double calculatePrice(JobType jobType, double area);
}
