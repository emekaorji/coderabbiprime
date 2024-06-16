package com.coderabbix.coderabbiprime.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("completion-b-8")
public class CompletionB8View extends VerticalLayout {

    public CompletionB8View() {
        add(new Button("Back to Home", e -> getUI().ifPresent(ui -> ui.navigate("/"))));
    }
}
