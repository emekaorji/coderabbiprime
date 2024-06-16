// package com.coderabbix.coderabbiprime.views;

// import com.vaadin.flow.component.button.Button;
// import com.vaadin.flow.component.html.Div;
// import com.vaadin.flow.component.html.ListItem;
// import com.vaadin.flow.component.html.Span;
// import com.vaadin.flow.component.html.UnorderedList;
// import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
// import com.vaadin.flow.component.orderedlayout.VerticalLayout;
// import com.vaadin.flow.router.Route;

// @Route("completion-a-1")
// public class CompletionA1View extends Div {

//     public CompletionA1View(TransferDetails details) {
//         // Create components to display the details
//         Span senderName = new Span(details.getSenderName());
//         Span itemDetails = new Span(details.getItemDetails());
//         Span quantity = new Span(String.valueOf(details.getQuantity()));
        
//         // Serial numbers could be listed, here's one way using an unordered list
//         UnorderedList serialNumberList = new UnorderedList();
//         details.getSerialNumbers().forEach(serialNumber ->
//             serialNumberList.add(new ListItem(serialNumber))
//         );
        
//         Span numberTransferred = new Span(String.valueOf(details.getNumberTransferred()));

//         // Layout to organize the information vertically
//         VerticalLayout infoLayout = new VerticalLayout(
//                 senderName,
//                 itemDetails,
//                 quantity,
//                 serialNumberList,
//                 numberTransferred
//         );

//         // Action buttons
//         Button acceptButton = new Button("Accept");
//         Button rejectButton = new Button("Reject");
//         Button reportProblemButton = new Button("Report Problem");

//         // You can define click listeners for the buttons to handle the logic
//         acceptButton.addClickListener(event -> {/* logic for accept */});
//         rejectButton.addClickListener(event -> {/* logic for reject */});
//         reportProblemButton.addClickListener(event -> {/* logic for report problem */});

//         // Group buttons horizontally
//         HorizontalLayout buttonLayout = new HorizontalLayout(
//                 acceptButton,
//                 rejectButton,
//                 reportProblemButton
//         );

//         // Add the information layout and buttons to the card
//         add(infoLayout, buttonLayout);

//         // Add some basic styling to make it look like a card
//         this.addClassName("transfer-card");
//         this.getStyle()
//                 .set("border", "1px solid #ccc")
//                 .set("padding", "1em")
//                 .set("border-radius", "5px")
//                 .set("box-shadow", "0 2px 4px rgba(0, 0, 0, 0.2)");
//     }
// }

