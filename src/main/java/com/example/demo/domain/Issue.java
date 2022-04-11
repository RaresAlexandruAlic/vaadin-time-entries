package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Issue {

	private Long id;
	private Long projectId;
	private Project project;
	private Long trackerId;
	private Long statusId;
	private Long priorityId;
	private Long authorId;
	private Long categoryId;
	private String subject;
}
