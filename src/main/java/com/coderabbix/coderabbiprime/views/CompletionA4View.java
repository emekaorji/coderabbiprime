package com.coderabbix.coderabbiprime.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("completion-a-4")
@PageTitle("Transaction Card")
public class CompletionA4View extends VerticalLayout {

    public CompletionA4View() {
        // Create the card layout
        addClassName("transaction-card");
        setWidth("400px");
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.START);
        setPadding(true);
        
        // Card header
        H3 senderName = new H3("Sender: John Doe");
        add(senderName);
        
        // Details of the transaction
        Div itemDetails = new Div();
        itemDetails.add(new Paragraph("Item: Computer Monitor"));
        itemDetails.add(new Paragraph("Quantity: 2"));
        itemDetails.add(new Paragraph("Serial Numbers: SN12345678, SN87654321"));
        itemDetails.add(new Paragraph("Number of Items Transferred: 2"));
        add(itemDetails);
        
        // Buttons for actions
        Button acceptButton = new Button("Accept", event -> {
            // Logic for accept
        });
        Button rejectButton = new Button("Reject", event -> {
            // Logic for reject
        });
        Button reportProblemButton = new Button("Report Problem", event -> {
            // Logic for reporting a problem
        });

        HorizontalLayout buttonLayout = new HorizontalLayout(acceptButton, rejectButton, reportProblemButton);
        buttonLayout.setJustifyContentMode(JustifyContentMode.BETWEEN);
        add(buttonLayout);
    }
}
