package com.example.hourscounter.controller;

import com.example.hourscounter.dto.WorkDTO;
import com.example.hourscounter.dto.WorkDoneDTO;
import com.example.hourscounter.service.WorkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/work")
public class WorkController {
    private final WorkService workService;

    @PostMapping("/done")
    public WorkDoneDTO workDone(WorkDTO workDTO){
        return workService.doneWork(workDTO);
    }


}
