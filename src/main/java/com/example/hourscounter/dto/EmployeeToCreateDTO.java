package com.example.hourscounter.dto;

import lombok.Data;

@Data
public class EmployeeToCreateDTO {
    private String employeeStatus;
    private String employeeType;
    private String firstName;
    private String lastName;
    private String birthday;
    private String street;
    private String PLZ;
    private String city;
    private String nationality;
    private String phone;
    private String email;
    private String password;
    private String euroProHour;

}
