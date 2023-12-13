package com.example.hourscounter.model;

import com.example.hourscounter.model.enums.JobType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "works")
public class Work {

    @Id
    @Column(name = "uuid")
    private UUID uuid;

    @Column(name = "job_type")
    private JobType jobType;

    @Column(name = "area")
    private Double area;

    @Column(name = "price")
    private Double price;

}
