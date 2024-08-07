package org.example.javafxprincipal;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    // FXML annotations to link UI components defined in the FXML file
    // Text field for user input of amount
    @FXML
    private TextField amountField;

    // Text field for user input of rate
    @FXML
    private TextField rateField;

    // Text field for user input of time
    @FXML
    private TextField timeField;

    // Button to trigger the calculation
    @FXML
    private Button calculateButton;

    // Label to display the result
    @FXML
    private Label resultLabel;

    // Instance of the Model class for business logic
    private Model model;

    // Method called when the FXML file is loaded
    @FXML
    public void initialize() {
        // Initialize the model
        model = new Model();

        // Set the action for the calculate button
        // When the button is clicked, the calculatePrincipal method is called
        calculateButton.setOnAction(event -> calculatePrincipal());
    }

    // Method to calculate the principal based on user input
    private void calculatePrincipal() {
        try {
            // Get values from text fields
            double amount = Double.parseDouble(amountField.getText());
            double rate = Double.parseDouble(rateField.getText());
            int time = Integer.parseInt(timeField.getText());

            // Calculate the principal using the model
            double principal = model.calculatePrincipal(amount, rate, time);

            // Display the result in the result label
            resultLabel.setText(String.format("Principal: %.2f", principal));
        } catch (NumberFormatException e) {
            // Display an error message if the input values are invalid
            resultLabel.setText("Please enter valid values.");
        }
    }
}
