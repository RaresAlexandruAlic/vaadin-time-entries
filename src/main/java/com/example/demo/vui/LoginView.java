package com.example.demo.vui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "")
@PageTitle(value = "Login to Time Application")
public class LoginView extends VerticalLayout {

	private TextField userField = new TextField("Input Username");
	private Button loginButton = new Button("Login");

	public LoginView() {
		add(userField, loginButton);
		loginButton.addClickListener(e -> UI.getCurrent().navigate("time-entries"));
	}
}
