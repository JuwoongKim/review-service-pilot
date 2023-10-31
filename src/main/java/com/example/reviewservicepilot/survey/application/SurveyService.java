package com.example.reviewservicepilot.survey.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.reviewservicepilot.question.application.QuestionService;
import com.example.reviewservicepilot.question.domain.Question;
import com.example.reviewservicepilot.survey.domain.Survey;
import com.example.reviewservicepilot.survey.repository.SurveyRepository;
import com.example.reviewservicepilot.surveyresult.application.SurveyResultService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SurveyService {

	private final QuestionService questionService;
	private final SurveyResultService surveyResultService;

	private final SurveyRepository surveyRepository;

	public Survey createSurvey(Long requesterId, Survey survey, List<Question> questions, List<Long> responserIdList) {
		survey.assignSurveyId(requesterId);
		Survey createdSurvey = surveyRepository.save(survey);
		questionService.createQuestions(createdSurvey.getId(), questions);
		surveyResultService.createSurveyResult(createdSurvey.getId(), responserIdList);

		return createdSurvey;
	}

	public List<Survey> getSurveysWithRequesterId(Long requesterId) {
		List<Survey> surveys = surveyRepository.findAllByRequesterId(requesterId);

		return surveys;
	}
}
