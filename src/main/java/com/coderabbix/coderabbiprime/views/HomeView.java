package com.coderabbix.coderabbiprime.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * Sender name
 * Details of the item
 * Quantity of items
 * Serial number
 * Number of items transferred
 * Buttons for "Accept", "Reject", and "Report Problem"
 */

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() {

        add(new H1("Welcome to your new application"));
        add(new Paragraph("This is the home view"));

        add(new Paragraph("You can edit this view in src/main/java/com/coderabbix/coderabbiprime/views/HomeView.java"));

        // add(new Button("Go to Completion A1", e -> getUI().ifPresent(ui -> ui.navigate(CompletionA1View.class))));
        add(new Button("Go to Completion B1", e -> getUI().ifPresent(ui -> ui.navigate(CompletionB1View.class))));
        add(new Button("Go to Completion A2", e -> getUI().ifPresent(ui -> ui.navigate(CompletionA2View.class))));
        add(new Button("Go to Completion B2", e -> getUI().ifPresent(ui -> ui.navigate(CompletionB2View.class))));
        // add(new Button("Go to Completion A3", e -> getUI().ifPresent(ui -> ui.navigate(CompletionA3View.class))));
        add(new Button("Go to Completion B3", e -> getUI().ifPresent(ui -> ui.navigate(CompletionB3View.class))));
        add(new Button("Go to Completion A4", e -> getUI().ifPresent(ui -> ui.navigate(CompletionA4View.class))));
        add(new Button("Go to Completion B4", e -> getUI().ifPresent(ui -> ui.navigate(CompletionB4View.class))));
        add(new Button("Go to Completion A5", e -> getUI().ifPresent(ui -> ui.navigate(CompletionA5View.class))));
        add(new Button("Go to Completion B5", e -> getUI().ifPresent(ui -> ui.navigate(CompletionB5View.class))));
        add(new Button("Go to Completion A6", e -> getUI().ifPresent(ui -> ui.navigate(CompletionA6View.class))));
        // add(new Button("Go to Completion B6", e -> getUI().ifPresent(ui -> ui.navigate(CompletionB6View.class))));
        add(new Button("Go to Completion A7", e -> getUI().ifPresent(ui -> ui.navigate(CompletionA7View.class))));
        add(new Button("Go to Completion B7", e -> getUI().ifPresent(ui -> ui.navigate(CompletionB7View.class))));
        add(new Button("Go to Completion A8", e -> getUI().ifPresent(ui -> ui.navigate(CompletionA8View.class))));
        add(new Button("Go to Completion B8", e -> getUI().ifPresent(ui -> ui.navigate(CompletionB8View.class))));

    }
}
