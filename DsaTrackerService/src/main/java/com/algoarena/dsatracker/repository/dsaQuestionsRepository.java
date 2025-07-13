package com.algoarena.dsatracker.repository;

import com.algoarena.dsatracker.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface dsaQuestionsRepository extends JpaRepository<Question, UUID> {
    List<Question> findByTopic(String topic);
    List<Question> findByRevisionDay3(LocalDate date);
    List<Question> findByRevisionDay5(LocalDate date);
    List<Question> findByRevisionDay9(LocalDate date);

    // 🚫 The implementation has been intentionally removed in the public version to prevent code misuse or duplication.
    // 🙌 Genuine reviewers/recruiters can contact me for a full demo or walkthrough.

    @Query("SELECT q.difficulty, COUNT(q) FROM Question q WHERE q.difficulty IS NOT NULL GROUP BY q.difficulty")
    List<Object[]> countByDifficulty();


    List<Question> findMissedRevisions(@Param("today") LocalDate today);

    List<Object[]> countQuestionsByTopic();

    List<Question> findUnsolvedByTopicAndDifficulty(@Param("topics") List<String> topics, @Param("difficulty") String difficulty);

    List<Question> findUnsolvedByDifficulty(@Param("difficulty") String difficulty);

    List<Object[]> findLastSolvedDateByTopic();
}


















