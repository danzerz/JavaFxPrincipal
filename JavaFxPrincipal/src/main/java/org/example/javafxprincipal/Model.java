package org.example.javafxprincipal;

public class Model {

    // Method to calculate the principal
    public double calculatePrincipal(double amount, double rate, int time) {
        // Calculate and return the principal using the formula: principal = amount / (1 + (rate * time))
        return amount / (1 + (rate * time));
    }
}