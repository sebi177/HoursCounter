package com.example.hourscounter.model;

import com.example.hourscounter.model.enums.EmployeeStatus;
import com.example.hourscounter.model.enums.EmployeeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Employee {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "employee_status")
    private EmployeeStatus employeeStatus;

    @Column(name = "employee_type")
    private EmployeeType employeeType;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birthday")
    private LocalDate birthDay;

    @Column(name = "street")
    private String street;

    @Column(name = "plz")
    private String PLZ;

    @Column(name = "city")
    private String city;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "euro_pro_hour")
    private Double EuroProHour;

    @ManyToMany
    private List<Job> jobList;
}
