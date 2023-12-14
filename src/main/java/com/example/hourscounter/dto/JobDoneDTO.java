package com.example.hourscounter.dto;

import lombok.Data;

@Data
public class JobDoneDTO {
    private String jobStatus;
    private String appointment;
    private String address;
    private String distance;
    private String hours;
    private String description;
    private String money;
}
