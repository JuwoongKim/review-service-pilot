package com.example.reviewservicepilot.survey.domain;

import java.time.LocalDateTime;

import com.example.reviewservicepilot.common.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "surveys")
public class Survey extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	Long requesterId;

	String title;

	String description;

	String type;

	LocalDateTime closedAt;

	protected Survey() {
	}

	public Survey(String title, String description, String type) {
		this.title = title;
		this.description = description;
		this.type = type;
	}
}
