package com.algoarena.JobTrackerService.controller;


import com.algoarena.JobTrackerService.dto.JobMinimalDto;
import com.algoarena.JobTrackerService.model.ApplicationStatus;
import com.algoarena.JobTrackerService.model.JobApplication;
import com.algoarena.JobTrackerService.service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin
public class JobApplicationController {

    @Autowired
    private JobApplicationService service;

    @PostMapping("/quick-add")
    public JobApplication quickAddJob(@RequestBody JobMinimalDto dto) throws IOException {
        return service.quickAddJob(dto);
    }

    @GetMapping
    public List<JobApplication> getAllJobs(){
        return service.getAllJobs();
    }

    @PutMapping("/{id}/status")
    public JobApplication updateStatus(@PathVariable UUID id, @RequestParam ApplicationStatus status){
        return service.updateStatus(id, status);
    }
}
