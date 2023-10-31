package com.example.reviewservicepilot.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reviewservicepilot.survey.domain.Survey;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {

}
