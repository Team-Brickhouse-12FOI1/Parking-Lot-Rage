package com.brickhouse.parkinglotrage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Parkinglotrage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Stage primaryStage;
    private BorderPane rootLayout;
    @Override
    public void start(Stage primaryStage) {
        System.out.println("Test");
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Parking Lot Rage :)");

    }
    public void innitRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Parkinglotrage.class.getResource("resources/main-window.fxml"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
