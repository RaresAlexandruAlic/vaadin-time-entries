package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Project {

	private Long id;
	private String name;
	private String identifier;
	private String description;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
	private boolean isPublic;

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final Project project = (Project) o;

		return identifier.equals(project.identifier);
	}

	@Override
	public int hashCode() {
		return identifier.hashCode();
	}
}
