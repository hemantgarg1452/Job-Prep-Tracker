package com.algoarena.dsatracker.dto;

import java.util.List;

public class ChallengeRequest {
    private List<String>weakTopics;
    private List<String>difficultyPreference;


    public ChallengeRequest(List<String> weakTopics, List<String> difficultyPreference) {
        this.weakTopics = weakTopics;
        this.difficultyPreference = difficultyPreference;
    }

    public List<String> getWeakTopics() {
        return weakTopics;
    }

    public void setWeakTopics(List<String> weakTopics) {
        this.weakTopics = weakTopics;
    }

    public List<String> getDifficultyPreference() {
        return difficultyPreference;
    }

    public void setDifficultyPreference(List<String> difficultyPreference) {
        this.difficultyPreference = difficultyPreference;
    }
}
