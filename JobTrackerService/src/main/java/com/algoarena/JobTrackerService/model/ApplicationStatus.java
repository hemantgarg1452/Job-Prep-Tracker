package com.algoarena.JobTrackerService.model;

public enum ApplicationStatus {
    APPLIED,      // resume sent or form submitted
    OA,           // online assessment received
    INTERVIEW,    // any interview round scheduled / done
    OFFER,        // offer received
    REJECTED      // process ended negatively
}
