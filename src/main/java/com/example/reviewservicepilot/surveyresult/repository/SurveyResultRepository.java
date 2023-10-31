package com.example.reviewservicepilot.surveyresult.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reviewservicepilot.surveyresult.domain.SurveyResult;

@Repository
public interface SurveyResultRepository extends JpaRepository<SurveyResult, Long> {

	List<SurveyResult> findAllByResponserId(Long responserId);

}
