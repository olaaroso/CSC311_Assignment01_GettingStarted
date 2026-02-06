package org.example.csc311_assignment01_gettingstarted;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {
    @FXML
    private Label welcomeText;

    // ToDo 01: add two text fields to the GUI so that the user can find the sum
    @FXML
    private TextField tfNumber1;
    @FXML
    private TextField tfNumber2;

    // ToDo 02: when the button is clicked show the output on the screen
    @FXML
    protected void onCalculateButtonClick() {
        try {
            String input1 = tfNumber1.getText();
            String input2 = tfNumber2.getText();

    // ToDo 03: you should accept only the numeric values
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);
            double sum = num1 + num2;

            welcomeText.setText("The sum is: " + sum);

        } catch (NumberFormatException e) {
            welcomeText.setText("Error: Please enter only numeric values.");
        }
    }
}