// package com.coderabbix.coderabbiprime.views;

// import com.vaadin.flow.component.button.Button;
// import com.vaadin.flow.component.card.Card;
// import com.vaadin.flow.component.html.Div;
// import com.vaadin.flow.component.html.H3;
// import com.vaadin.flow.component.html.Paragraph;
// import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
// import com.vaadin.flow.component.orderedlayout.VerticalLayout;
// import com.vaadin.flow.router.Route;

// @Route("completion-b-6")
// public class CompletionB6View extends VerticalLayout {

//     public CompletionB6View() {
//         Card card = new Card();
//         add(card);
        
//         VerticalLayout detailsLayout = new VerticalLayout();
//         card.add(detailsLayout);
        
//         H3 senderName = new H3("Sender's Name: John Doe");
//         detailsLayout.add(senderName);

//         Paragraph itemDetails = new Paragraph("Item Details: Sample item");
//         detailsLayout.add(itemDetails);

//         Paragraph itemQuantity = new Paragraph("Quantity: 5");
//         detailsLayout.add(itemQuantity);

//         Paragraph serialNumbers = new Paragraph("Serial Numbers: SN12345, SN12346, SN12347, SN12348, SN12349");
//         detailsLayout.add(serialNumbers);

//         Paragraph transferredItems = new Paragraph("Items Transferred: 5");
//         detailsLayout.add(transferredItems);

//         HorizontalLayout actionsLayout = new HorizontalLayout();
//         detailsLayout.add(actionsLayout);
        
//         Button acceptButton = new Button("Accept");
//         acceptButton.addClickListener(e -> {
//             // Implement the logic for accepting the item transfer
//         });
//         actionsLayout.add(acceptButton);

//         Button rejectButton = new Button("Reject");
//         rejectButton.addClickListener(e -> {
//             // Implement the logic for rejecting the item transfer
//         });
//         actionsLayout.add(rejectButton);

//         Button problemButton = new Button("Report Problem");
//         problemButton.addClickListener(e -> {
//             // Implement the logic for reporting a problem
//         });
//         actionsLayout.add(problemButton);
//     }
// }

