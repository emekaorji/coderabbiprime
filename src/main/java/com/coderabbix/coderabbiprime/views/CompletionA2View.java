package com.coderabbix.coderabbiprime.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("completion-a-2")
@CssImport("./styles/shared-styles.css") // Optionally import custom styles if required
public class CompletionA2View extends VerticalLayout {

    public CompletionA2View() {
        // Creating the card layout
        FormLayout cardLayout = new FormLayout();
        
        // Creating labels for the card details
        Label senderName = new Label("Sender Name: John Doe");
        Label itemDetails = new Label("Item: Widget X");
        Label itemQuantity = new Label("Quantity: 5");
        Label serialNumbers = new Label("Serial Numbers: 12345, 12346, 12347, 12348, 12349");
        Label itemsTransferred = new Label("Items Transferred: 5");

        // Adding the labels to the form layout
        cardLayout.addFormItem(senderName, "Sender's Name");
        cardLayout.addFormItem(itemDetails, "Item Details");
        cardLayout.addFormItem(itemQuantity, "Quantity");
        cardLayout.addFormItem(serialNumbers, "Serial Numbers");
        cardLayout.addFormItem(itemsTransferred, "Number of Items Transferred");
        
        // Creating buttons with event listeners
        Button acceptButton = new Button("Accept", event -> acceptItems());
        acceptButton.addThemeVariants(ButtonVariant.LUMO_SUCCESS);

        Button rejectButton = new Button("Reject", event -> rejectItems());
        rejectButton.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button reportProblemButton = new Button("Report Problem", event -> reportProblem());
        reportProblemButton.addThemeVariants(ButtonVariant.LUMO_CONTRAST);

        // Adding the buttons to a horizontal layout
        HorizontalLayout buttonLayout = new HorizontalLayout(acceptButton, rejectButton, reportProblemButton);

        // Adding all components to the main card layout
        add(cardLayout, buttonLayout);
        setWidth("400px"); // Adjust as per your layout needs
        setPadding(true);
        setSpacing(true);
    }

    // Action handlers
    private void acceptItems() {
        // Placeholder code for accept action
        System.out.println("Items Accepted: Work Started");
    }
    
    private void rejectItems() {
        // Placeholder code for reject action
        System.out.println("Items Rejected: Returned to Sender");
    }
    
    private void reportProblem() {
        // Placeholder code for report problem action
        System.out.println("Problem Reported");
    }
}

