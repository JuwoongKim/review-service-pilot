package com.example.reviewservicepilot.question.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reviewservicepilot.question.domain.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
