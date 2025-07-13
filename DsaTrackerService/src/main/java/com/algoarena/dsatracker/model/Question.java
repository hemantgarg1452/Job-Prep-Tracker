package com.algoarena.dsatracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String topic;
    private String platform;
    private String link;

    private LocalDate dateSolved;

    private LocalDate revisionDay3;

    private LocalDate revisionDay5;
    private LocalDate revisionDay9;

    private boolean isRevisedOn3;
    private boolean isRevisedOn5;
    private boolean isRevisedOn9;

    private String notes;
    private String difficulty;

    private boolean solved = true;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTopic() {
        return topic;
    }

    public String getPlatform() {
        return platform;
    }

    public String getLink() {
        return link;
    }

    public LocalDate getRevisionDay3() {
        return revisionDay3;
    }

    public LocalDate getRevisionDay5() {
        return revisionDay5;
    }

    public LocalDate getRevisionDay9() {
        return revisionDay9;
    }

    public boolean isRevisedOn3() {
        return isRevisedOn3;
    }

    public boolean isRevisedOn5() {
        return isRevisedOn5;
    }

    public boolean isRevisedOn9() {
        return isRevisedOn9;
    }

    public String getNotes() {
        return notes;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public LocalDate getDateSolved() {
        return dateSolved;
    }

    public void setDateSolved(LocalDate dateSolved) {
        this.dateSolved = dateSolved;
    }

    public void setRevisionDay3(LocalDate revisionDay3) {
        this.revisionDay3 = revisionDay3;
    }

    public void setRevisionDay5(LocalDate revisionDay5) {
        this.revisionDay5 = revisionDay5;
    }

    public void setRevisionDay9(LocalDate revisionDay9) {
        this.revisionDay9 = revisionDay9;
    }

    public void setRevisedOn3(boolean revisedOn3) {
        this.isRevisedOn3 = revisedOn3;
    }

    public void setRevisedOn5(boolean revisedOn5) {
        this.isRevisedOn5 = revisedOn5;
    }

    public void setRevisedOn9(boolean revisedOn9) {
        this.isRevisedOn9 = revisedOn9;
    }


}
