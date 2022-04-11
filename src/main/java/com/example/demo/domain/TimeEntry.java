package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class TimeEntry {

	private Long id;
	private LocalDateTime end = LocalDateTime.now();
	private LocalDateTime start = LocalDateTime.now();
	private int pause = 0;
	private String description = "";
	private Project project;
	private Issue issue;
	private User user;
}
