package com.example.hourscounter.service;

import com.example.hourscounter.dto.InfoDto;
import com.example.hourscounter.dto.JobDTO;
import com.example.hourscounter.dto.JobDoneDTO;
import com.example.hourscounter.dto.JobToDoDTO;
import com.example.hourscounter.model.Employee;
import com.example.hourscounter.model.Job;
import com.example.hourscounter.model.Work;

import java.util.List;
import java.util.UUID;

public interface JobService {
    JobDTO createJob(Job job);

    Double calculatePrice(List<Work> works, List<Employee> workers);

    JobDTO createJobToDo(JobToDoDTO job);

    JobDoneDTO doneJob(UUID jobId, List<UUID> works, List<UUID> employees, InfoDto info);
}
