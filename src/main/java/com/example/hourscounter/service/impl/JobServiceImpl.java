package com.example.hourscounter.service.impl;

import com.example.hourscounter.dto.InfoDto;
import com.example.hourscounter.dto.JobDTO;
import com.example.hourscounter.dto.JobDoneDTO;
import com.example.hourscounter.dto.JobToDoDTO;
import com.example.hourscounter.exception.NotFoundException;
import com.example.hourscounter.mapper.JobMapper;
import com.example.hourscounter.model.Employee;
import com.example.hourscounter.model.Job;
import com.example.hourscounter.model.Work;
import com.example.hourscounter.model.enums.JobStatus;
import com.example.hourscounter.repository.EmployeeRepository;
import com.example.hourscounter.repository.JobRepository;
import com.example.hourscounter.repository.WorkRepository;
import com.example.hourscounter.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {
    private final JobMapper jobMapper;
    private final JobRepository jobRepository;
    private final WorkRepository workRepository;
    private final EmployeeRepository employeeRepository;


    @Override
    public JobDTO createJob(Job job) {
        return jobMapper.toDTO(jobRepository.save(job));
    }

    @Override
    public Double calculatePrice(List<Work> works, List<Employee> workers) {
        double sum = works.stream().map(Work::getPrice)
                .mapToDouble(Double::doubleValue)
                .sum();

        return sum / workers.size();
    }

    @Override
    public JobDTO createJobToDo(JobToDoDTO job) {
        Job toDo = jobMapper.toEntity(job);
        toDo.setJobStatus(JobStatus.ACTIVE);
        jobRepository.save(toDo);
        return jobMapper.toDTO(toDo);
    }

    @Override
    public JobDoneDTO doneJob(UUID jobId, List<UUID> works, List<UUID> employees, InfoDto info) {
        Job job = jobRepository.findById(jobId).orElseThrow(() -> new NotFoundException("Job not found"));
        job.setJobStatus(JobStatus.DONE);
        List<Work> works1 = works.stream().map((UUID id) -> {
            return workRepository.findById(id).orElseThrow(() -> new NotFoundException("Job not found!"));
        }).toList();
        job.setWorks(works1);
        List<Employee> employees1 = employees.stream().map((UUID id) -> {
            return employeeRepository.findById(id).orElseThrow(() -> new NotFoundException("Job not found!"));
        }).toList();
        job.setWorkers(employees1);
        job.setHours(Double.parseDouble(info.getHours()));
        job.setDescription(info.getDescription());
        job.setMoney(calculatePrice(works1, employees1));
        jobRepository.save(job);
        return jobMapper.todto(job);
    }


}
