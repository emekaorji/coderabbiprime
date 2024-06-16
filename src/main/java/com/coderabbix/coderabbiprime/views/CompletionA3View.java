// package com.coderabbix.coderabbiprime.views;

// import com.vaadin.flow.component.button.Button;
// import com.vaadin.flow.component.button.ButtonVariant;
// import com.vaadin.flow.component.card.Card;
// import com.vaadin.flow.component.html.Div;
// import com.vaadin.flow.component.orderedlayout.VerticalLayout;
// import com.vaadin.flow.router.Route;


// @Route("completion-a-3")
// public class CompletionA3View extends VerticalLayout {

//     public CompletionA3View() {
//         // Creating card component
//         Card transferCard = new Card();
//         transferCard.addClassName("transfer-card");

//         // Details of the transfer
//         String senderName = "John Doe";
//         String itemDetails = "Widget Type X";
//         int quantity = 5;
//         String serialNumbers = "SN123, SN124, SN125, SN126, SN127";
//         int itemsTransferred = 5;

//         // Displaying transfer details
//         Div senderNameDiv = createTextDiv("Sender: ", senderName);
//         Div itemDetailsDiv = createTextDiv("Item Details: ", itemDetails);
//         Div quantityDiv = createTextDiv("Quantity: ", String.valueOf(quantity));
//         Div serialNumbersDiv = createTextDiv("Serial Numbers: ", serialNumbers);
//         Div itemsTransferredDiv = createTextDiv("Items Transferred: ", String.valueOf(itemsTransferred));

//         // Adding details to the card
//         transferCard.add(senderNameDiv, itemDetailsDiv, quantityDiv, serialNumbersDiv, itemsTransferredDiv);

//         // Buttons
//         Button acceptButton = new Button("Accept", e -> acceptTransfer());
//         acceptButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
//         Button rejectButton = new Button("Reject", e -> rejectTransfer());
//         Button reportProblemButton = new Button("Report Problem", e -> reportProblem());

//         // Adding buttons to layout
//         Div buttonLayout = new Div(acceptButton, rejectButton, reportProblemButton);
//         buttonLayout.addClassName("button-layout");

//         // Adding everything to the main layout
//         add(transferCard, buttonLayout);
//     }

//     private Div createTextDiv(String label, String value) {
//         Div div = new Div();
//         div.addClassName("text-div");
//         div.setText(label + value);
//         return div;
//     }

//     private void acceptTransfer() {
//         // Logic for accepting the transfer
//         System.out.println("Transfer accepted. Starting work with the items.");
//     }

//     private void rejectTransfer() {
//         // Logic for rejecting the transfer
//         System.out.println("Transfer rejected. Items are being returned to the sender.");
//     }

//     private void reportProblem() {
//         // Logic for reporting a problem
//         System.out.println("A problem with the transfer has been reported.");
//     }
// }

