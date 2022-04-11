package com.example.demo.vui;

import com.example.demo.domain.Issue;
import com.example.demo.domain.Project;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextField;

public class TimeEntryEditor extends Composite<HorizontalLayout> {

	private HorizontalLayout content;
	private Select<Project> projectField;
	private Select<Issue> issueField;
	private DateTimePicker startDateTimeField;
	private DateTimePicker endDateTimeField;
	private TextField descriptionField;
	private IntegerField pauseField;
	private Button submitButton = new Button("Submit");

	public TimeEntryEditor(){

	}

	@Override
	public HorizontalLayout getContent() {
		return this.content;
	}

}
