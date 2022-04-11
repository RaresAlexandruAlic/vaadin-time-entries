package com.example.demo.vui;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.RouterLayout;

public class RootView extends VerticalLayout implements RouterLayout, BeforeEnterObserver {

	private Grid grid;

	public RootView() {
	}

	@Override
	public void beforeEnter(final BeforeEnterEvent event) {

	}
}
