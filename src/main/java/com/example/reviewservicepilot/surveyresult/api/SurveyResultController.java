package com.example.reviewservicepilot.surveyresult.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.reviewservicepilot.surveyresult.application.SurveyResultService;
import com.example.reviewservicepilot.surveyresult.domain.SurveyResult;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SurveyResultController {

	private final SurveyResultService surveyResultService;

	@GetMapping("/invited-surveys/{surveyResultId}")
	public ResponseEntity<List<SurveyResult>> getSurveyWithResponserId(@PathVariable Long surveyResultId) {
		List<SurveyResult> surveyResults = surveyResultService.getSurveyResultsWithResponserId(surveyResultId);

		return new ResponseEntity<List<SurveyResult>>(surveyResults, HttpStatus.OK);
	}

}
