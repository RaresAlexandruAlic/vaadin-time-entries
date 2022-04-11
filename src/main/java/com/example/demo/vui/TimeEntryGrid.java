package com.example.demo.vui;

import com.example.demo.domain.TimeEntry;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.List;
public class TimeEntryGrid extends Composite<Grid<TimeEntry>> {

	private Grid<TimeEntry> timeEntryGrid;

	public TimeEntryGrid() {
		timeEntryGrid = new Grid<>(TimeEntry.class);
		timeEntryGrid.addColumn(TimeEntry::getProject).setHeader("Project");
		timeEntryGrid.addColumn(TimeEntry::getIssue).setHeader("Issue");
		timeEntryGrid.addColumn(TimeEntry::getDescription).setHeader("Description");
		timeEntryGrid.addColumn(TimeEntry::getStart).setHeader("Start Time");
		timeEntryGrid.addColumn(TimeEntry::getEnd).setHeader("End Time");
		timeEntryGrid.addColumn(TimeEntry::getPause).setHeader("Pause");

		List<TimeEntry> timeEntryList = null;
		timeEntryGrid.setItems(timeEntryList);
	}

}
