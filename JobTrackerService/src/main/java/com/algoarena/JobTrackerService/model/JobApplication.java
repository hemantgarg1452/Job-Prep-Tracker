package com.algoarena.JobTrackerService.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.Builder;       // must be this exact line


import java.time.LocalDate;
import java.util.UUID;

@Entity
@Builder
public class JobApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String company;
    private String role;
    private String location;
    private String jobLink;
    private LocalDate appliedDate;
    private String notes;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    public JobApplication() {
    }

    public JobApplication(UUID id, String company, String role, String location, String jobLink, LocalDate appliedDate, String notes, ApplicationStatus status) {
        this.id = id;
        this.company = company;
        this.role = role;
        this.location = location;
        this.jobLink = jobLink;
        this.appliedDate = appliedDate;
        this.notes = notes;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJobLink() {
        return jobLink;
    }

    public void setJobLink(String jobLink) {
        this.jobLink = jobLink;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }
}

