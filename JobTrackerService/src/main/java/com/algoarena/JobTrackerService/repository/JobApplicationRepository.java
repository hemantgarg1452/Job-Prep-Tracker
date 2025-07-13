package com.algoarena.JobTrackerService.repository;

import com.algoarena.JobTrackerService.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobApplicationRepository extends JpaRepository<JobApplication, UUID> {
}
