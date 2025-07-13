package com.algoarena.JobTrackerService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class JobMinimalDto {
    String jobLink;
    String role;
    String company;

    public JobMinimalDto(String jobLink, String role, String company) {
        this.jobLink = jobLink;
        this.role = role;
        this.company = company;
    }

    public String getJobLink() {
        return jobLink;
    }

    public void setJobLink(String jobLink) {
        this.jobLink = jobLink;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
