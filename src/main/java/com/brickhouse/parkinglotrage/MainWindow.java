package com.brickhouse.parkinglotrage;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;


public class MainWindow implements Initializable {
    // Local Variables
    public Button button_menu;
    public Button button_shop;
    public GridPane grid;


    @FXML
    protected void ClickMenuButton() {
        System.out.println("Menu Opened!");
    }
    @FXML
    protected void ClickShopButton(){
        System.out.println("Shop Opened!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
