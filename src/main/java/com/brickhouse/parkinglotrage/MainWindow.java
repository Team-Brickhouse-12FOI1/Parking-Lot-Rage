package com.brickhouse.parkinglotrage;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class MainWindow {
    @FXML
    private Label text;

@FXML
protected void onHelloButtonClick() {text.setText("It Works!!!");}
}
