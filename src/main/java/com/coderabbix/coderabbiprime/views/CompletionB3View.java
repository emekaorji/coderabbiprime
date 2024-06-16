package com.coderabbix.coderabbiprime.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("completion-b-3")
@CssImport("./styles/shared-styles.css")
public class CompletionB3View extends VerticalLayout {

    public CompletionB3View() {
        // Creating necessary components
        TextField senderName = new TextField("Sender's Name");
        TextArea itemDetails = new TextArea("Item Details");
        TextField itemQuantity = new TextField("Quantity");
        TextArea serialNumbers = new TextArea("Serial Numbers");
        TextField itemsTransferred = new TextField("Items Transferred");

        // Setting the text areas to have a specific height
        itemDetails.setHeight("100px");
        serialNumbers.setHeight("100px");

        // Creating action buttons
        Button acceptButton = new Button("Accept", e -> {
            // Logic to handle acceptance of items
            System.out.println("Items Accepted");
        });
        Button rejectButton = new Button("Reject", e -> {
            // Logic to handle rejection of items
            System.out.println("Items Rejected");
        });
        Button reportProblemButton = new Button("Report Problem", e -> {
            // Logic to handle reporting a problem
            System.out.println("Problem Reported");
        });

        // Adding components to the layout
        add(
                senderName,
                itemDetails,
                itemQuantity,
                serialNumbers,
                itemsTransferred,
                acceptButton,
                rejectButton,
                reportProblemButton
        );

        // Styling the layout
        setSpacing(true);
        setPadding(true);
    }
}

