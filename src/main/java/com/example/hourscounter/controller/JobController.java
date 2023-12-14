package com.example.hourscounter.controller;

import com.example.hourscounter.dto.InfoDto;
import com.example.hourscounter.dto.JobDTO;
import com.example.hourscounter.dto.JobDoneDTO;
import com.example.hourscounter.dto.JobToDoDTO;
import com.example.hourscounter.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/job")
public class JobController {
    private final JobService jobService;

    @PostMapping("/createToDo")
    public JobDTO createJobToDo(JobToDoDTO job){
        return jobService.createJobToDo(job);
    }

    @PostMapping("/update")
    public JobDoneDTO jobDone(UUID jobId, List<UUID> workers, List<UUID> works, InfoDto info){
        return jobService.doneJob(jobId, works, workers,info);
    }
}
