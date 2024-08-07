package org.example.javafxprincipal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        // FXMLLoader is used to load the FXML file for the GUI
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));

        // The Parent class is the base class for all nodes that have children in the scene graph
        Parent root = loader.load();

        // Set up the stage (main window of the application)
        // Set the title of the primary stage
        primaryStage.setTitle("Principal Calculation App");

        // Create a scene with the loaded FXML root and set its size
        primaryStage.setScene(new Scene(root, 400, 300));

        // Display the primary stage
        primaryStage.show();
    }

    // The main method is the entry point of the application
    public static void main(String[] args) {
        // Launch the JavaFX application, which internally calls the start method
        launch(args);
    }
}
