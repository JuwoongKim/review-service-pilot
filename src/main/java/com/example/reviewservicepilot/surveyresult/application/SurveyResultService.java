package com.example.reviewservicepilot.surveyresult.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.reviewservicepilot.surveyresult.domain.SurveyResult;
import com.example.reviewservicepilot.surveyresult.repository.SurveyResultRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SurveyResultService {

	private final SurveyResultRepository surveyResultRepository;

	public void createSurveyResult(Long surveyId, List<Long> responserIdList) {
		List<SurveyResult> surveyResults = responserIdList.stream()
			.map(responserId -> new SurveyResult(surveyId, responserId)).toList();

		surveyResultRepository.saveAll(surveyResults);
	}

	public List<SurveyResult> getSurveyResultsWithResponserId(Long responserId) {
		List<SurveyResult> surveyResults = surveyResultRepository.findAllByResponserId(responserId);

		return surveyResults;
	}

}
