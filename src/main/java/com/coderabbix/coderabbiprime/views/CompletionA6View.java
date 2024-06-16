package com.coderabbix.coderabbiprime.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route("completion-a-6")
public class CompletionA6View extends VerticalLayout {

    public CompletionA6View() {
        // Sender's name
        Span senderName = new Span("Sender: John Doe");
        
        // Item details
        Span itemDetails = new Span("Item: Widget XYZ - Model ABC");

        // Quantity of items
        TextField quantityField = new TextField("Quantity");
        quantityField.setReadOnly(true);
        quantityField.setValue("10");

        // Serial numbers
        TextField serialNumbersField = new TextField("Serial Numbers");
        serialNumbersField.setReadOnly(true);
        serialNumbersField.setValue("S/N 001, S/N 002, ..., S/N 010");

        // Number of items transferred
        TextField transferredItemsField = new TextField("Transferred Items");
        transferredItemsField.setReadOnly(true);
        transferredItemsField.setValue("0");

        // Buttons
        Button acceptButton = new Button("Accept");
        Button rejectButton = new Button("Reject");
        Button reportProblemButton = new Button("Report Problem");

        // Action handlers for buttons (dummy implementation)
        acceptButton.addClickListener(event -> {
            // Action when accept button is clicked
            // User accepts the quantity and starts work
        });

        rejectButton.addClickListener(event -> {
            // Action when reject button is clicked
            // Items are returned to the sender
        });

        reportProblemButton.addClickListener(event -> {
            // Action when report problem button is clicked
            // User reports a problem with the transfer
        });

        // Horizontal layout for buttons
        HorizontalLayout buttonLayout = new HorizontalLayout(acceptButton, rejectButton, reportProblemButton);

        // Add components to the card
        add(senderName, itemDetails, quantityField, serialNumbersField, transferredItemsField, buttonLayout);
    }
}

