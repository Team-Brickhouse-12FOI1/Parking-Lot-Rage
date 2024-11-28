package com.brickhouse.parkinglotrage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Parkinglotrage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Stage primaryStage;
    private AnchorPane rootLayout;
    @Override
    public void start(Stage primaryStage) {
        System.out.println("Test");
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Parking Lot Rage :)");
        innitMainWindow();

    }
    public void innitMainWindow() {
        try {
            // Load FXML File
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Parkinglotrage.class.getResource("main-window.fxml"));
            rootLayout = (AnchorPane) loader.load();

            // Show the scene containig main-window
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
