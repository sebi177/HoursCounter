package com.example.hourscounter.service;

import com.example.hourscounter.dto.WorkDTO;
import com.example.hourscounter.model.Work;

public interface WorkService {
    WorkDTO createWork(Work work);
}
