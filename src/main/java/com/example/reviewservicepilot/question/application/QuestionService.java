package com.example.reviewservicepilot.question.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.reviewservicepilot.question.domain.Question;
import com.example.reviewservicepilot.question.repository.QuestionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {

	public final QuestionRepository questionRepository;

	public boolean createQuestions(Long surveyId, List<Question> questions) {
		questions.forEach(v -> v.assignSurveyId(surveyId));
		List<Question> questions1 = questionRepository.saveAll(questions);
		return true;
	}

}
