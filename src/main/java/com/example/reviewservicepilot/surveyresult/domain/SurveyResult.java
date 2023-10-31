package com.example.reviewservicepilot.surveyresult.domain;

import static com.example.reviewservicepilot.surveyresult.domain.DeadlineStatus.*;

import com.example.reviewservicepilot.common.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "survey_results")
public class SurveyResult extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long surveyId;

	private Long responserId;

	private DeadlineStatus deadlineStatus;

	private boolean questionAnsweredStatus;

	protected SurveyResult() {
	}

	public SurveyResult(Long surveyId, Long responserId) {
		this.surveyId = surveyId;
		this.responserId = responserId;
		this.deadlineStatus = PROCEEDING;
		this.questionAnsweredStatus = false;

	}

}
