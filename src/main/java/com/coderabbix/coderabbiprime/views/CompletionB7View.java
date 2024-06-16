package com.coderabbix.coderabbiprime.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("completion-b-7")
@CssImport("./styles/card-styles.css") // You can define custom CSS to style the card
public class CompletionB7View extends Div {

    public CompletionB7View() {
        String[] _serialNumbers = {"serial-1", "serial-2"};
        TransferCard transferCard = new TransferCard("Emeka", "Some Item", "Some Item Details", 5, _serialNumbers);
        add(transferCard);
    }
}

class TransferCard extends Div {

    public TransferCard(String senderName, String itemName, String itemDetails, int quantity, String[] serialNumbers) {
        // Header
        Div header = new Div();
        header.setText("Transfer Details:");
        header.addClassNames("card-header");

        // Sender's name
        TextField senderField = new TextField("Sender:");
        senderField.setValue(senderName);
        senderField.setReadOnly(true);

        // Item details
        TextField itemField = new TextField("Item:");
        itemField.setValue(itemName + " - " + itemDetails);
        itemField.setReadOnly(true);

        // Quantity
        TextField quantityField = new TextField("Quantity:");
        quantityField.setValue(Integer.toString(quantity));
        quantityField.setReadOnly(true);

        // Serial numbers
        TextField serialNumbersField = new TextField("Serial Numbers:");
        serialNumbersField.setValue(String.join(", ", serialNumbers));
        serialNumbersField.setReadOnly(true);

        // Buttons
        Button acceptButton = new Button("Accept");
        Button rejectButton = new Button("Reject");
        Button reportProblemButton = new Button("Report Problem");

        // Button click listeners
        acceptButton.addClickListener(event -> {
            // Handle accept action
        });

        rejectButton.addClickListener(event -> {
            // Handle reject action
        });

        reportProblemButton.addClickListener(event -> {
            // Handle report problem action
        });

        // Button layout
        HorizontalLayout buttonLayout = new HorizontalLayout(acceptButton, rejectButton, reportProblemButton);
        buttonLayout.setSpacing(true);

        // Card layout
        VerticalLayout cardLayout = new VerticalLayout(header, senderField, itemField, quantityField, serialNumbersField, buttonLayout);
        cardLayout.addClassNames("card");
        add(cardLayout);
    }
}

