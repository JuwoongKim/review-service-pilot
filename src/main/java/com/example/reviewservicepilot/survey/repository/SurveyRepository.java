package com.example.reviewservicepilot.survey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reviewservicepilot.survey.domain.Survey;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {

	List<Survey> findAllByRequesterId(Long requesterId);

}
