package com.example.reviewservicepilot.survey.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.reviewservicepilot.survey.application.SurveyService;
import com.example.reviewservicepilot.survey.domain.Survey;
import com.example.reviewservicepilot.survey.dto.request.CreateSurveyRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SurveyController {

	private final SurveyService surveyService;

	@PostMapping("/survey")
	public ResponseEntity<Survey> createSurvey(@RequestBody CreateSurveyRequest createSurveyRequest) {
		Survey survey = createSurveyRequest.toEntity();

		Survey createdSurvey = surveyService.createSurvey(
			1L,
			survey,
			createSurveyRequest.questions(),
			createSurveyRequest.responserIdList()
		);

		return new ResponseEntity<Survey>(createdSurvey, HttpStatus.CREATED);
	}

	@GetMapping("/survey/{requesterId}")
	public ResponseEntity<List<Survey>> getSurveysWithRequesterId(@PathVariable Long requesterId) {
		List<Survey> surveys = surveyService.getSurveysWithRequesterId(requesterId);

		return new ResponseEntity<List<Survey>>(surveys, HttpStatus.OK);
	}

}
