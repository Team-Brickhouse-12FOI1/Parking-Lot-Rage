module com.brickhouse.parkinglotrage {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.brickhouse.parkinglotrage to javafx.fxml;
    exports com.brickhouse.parkinglotrage;
}