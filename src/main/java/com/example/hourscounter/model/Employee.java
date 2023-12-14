package com.example.hourscounter.model;

import com.example.hourscounter.model.enums.EmployeeStatus;
import com.example.hourscounter.model.enums.EmployeeType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeStatus=" + employeeStatus +
                ", employeeType=" + employeeType +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", street='" + street + '\'' +
                ", PLZ='" + PLZ + '\'' +
                ", city='" + city + '\'' +
                ", nationality='" + nationality + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", EuroProHour=" + EuroProHour +
                '}';
    }
}
