package com.algoarena.dsatracker.dto;

public class ReboundAlert {
    private String topic;
    private long days; // days since last solve
    private String lastSolved; // ISO string for easy JSON


    public ReboundAlert(String topic, long days, String lastSolved) {
        this.topic = topic;
        this.days = days;
        this.lastSolved = lastSolved;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public long getDays() {
        return days;
    }

    public void setDays(long days) {
        this.days = days;
    }

    public String getLastSolved() {
        return lastSolved;
    }

    public void setLastSolved(String lastSolved) {
        this.lastSolved = lastSolved;
    }
}
