package com.example.hourscounter.model;

import com.example.hourscounter.model.enums.JobStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "job_status")
    @Enumerated(EnumType.STRING)
    private JobStatus jobStatus;

    @Column(name = "appointment")
    private LocalDate appointment;

    @Column(name = "address")
    private String address;

    @Column(name = "distance")
    private Double distance;

    @Column(name = "hours")
    private Double hours;

    @Column(name = "description")
    private String description;

    @ManyToMany
    private List<Employee> workers;

    @Column(name = "money")
    private Double money;

    @ManyToMany
    private List<Work> works;

}
