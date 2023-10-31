package com.example.reviewservicepilot.survey.dto.request;

import java.util.List;

import com.example.reviewservicepilot.question.domain.Question;
import com.example.reviewservicepilot.survey.domain.Survey;
import com.example.reviewservicepilot.survey.domain.SurveyType;

public record CreateSurveyRequest(String title,
								  String description,
								  SurveyType type,
								  List<Question> questions,
								  List<Long> responserIdList
) {
	public Survey toEntity() {
		return new Survey(title, description, type);
	}
}
