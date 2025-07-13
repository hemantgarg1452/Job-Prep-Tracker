package com.algoarena.dsatracker.controller;

import com.algoarena.dsatracker.dto.ChallengeRequest;
import com.algoarena.dsatracker.dto.ReboundAlert;
import com.algoarena.dsatracker.model.Question;
import com.algoarena.dsatracker.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/questions")
@CrossOrigin
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping
    public Question addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @GetMapping("/getAll")
    public List<Question> getAll(){
        return questionService.getAll();
    }

    @GetMapping("/revisions/today")
    public List<Question> getTodayRevisions(){
        return questionService.getTodayRevisions();
    }

    @PutMapping("/{id}/revise/{round}")
    public Question markRevision(@PathVariable UUID id, @PathVariable int round){
        return questionService.markRevision(id, round);
    }

    @GetMapping("/stats/difficulty")
    public Map<String, Long> getDifficultyStatus(){
        return questionService.getQuestionCountByDifficulty();
    }

    @GetMapping("/revisions/missed")
    public List<Question> getMissedRevisions(){
        return questionService.getMissedRevisions();
    }

    @GetMapping("/progress/topic-wise")
    public Map<String, Long> getTopicProgress(){
        return questionService.getTopicWiseProgress();
    }

    @GetMapping("/daily-challenge")
    public Map<String, Question>getCustomChallenge(@RequestBody ChallengeRequest challengeRequest){
        return questionService.getDailyChallenge(challengeRequest.getWeakTopics(), challengeRequest.getDifficultyPreference());
    }

    @GetMapping("/daily-challenge/auto")
    public Map<String, Question> getAutoChallenge(){
        return questionService.getAutoChallenge();
    }

    @GetMapping("/progress/rebound/alerts")
    public Map<String, List<ReboundAlert>> reboundAlerts(@RequestParam(defaultValue = "30") int days){
        return questionService.getReboundAlerts(days);
    }
}
