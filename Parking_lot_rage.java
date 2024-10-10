import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Group; 

public class Parking_lot_rage extends Application{
    @Override
    public void start(Stage stage) {
        

        // Creating the root Group and adding it to a Scene
        Group root = new Group(); 
        Scene scene = new Scene(root, 600, 300);  
      
        //Setting title to the Stage 
        stage.setTitle("Drawing a Rectangle"); 
         
        //Adding scene to the stage 
        stage.setScene(scene); 
         
        //Displaying the contents of the stage 
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
