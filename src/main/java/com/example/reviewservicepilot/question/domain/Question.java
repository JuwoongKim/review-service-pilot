package com.example.reviewservicepilot.question.domain;

import com.example.reviewservicepilot.common.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "questions")
public class Question extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	Long surveyId;

	String title;

	QuestionType type;

	String options;

	int sequence;

	boolean isRequired;

	protected Question() {
	}

	public Question(String title, QuestionType type, String options, int sequence, boolean isRequired) {
		this.title = title;
		this.type = type;
		this.options = options;
		this.sequence = sequence;
		this.isRequired = isRequired;
	}

	public void assignSurveyId(Long surveyId) {
		this.surveyId = surveyId;
	}
}