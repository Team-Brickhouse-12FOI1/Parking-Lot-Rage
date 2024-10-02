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
        int recSize = 50;
        int recX = 0;
        int recY = 0;
        int[][] matrixPlayer = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Rectangle[][] rectangle = new Rectangle[3][3];
        Group root = new Group(); 
        for (Rectangle[] row : rectangle) {
            recY += 75;
            for (Rectangle i : row) {
                recX += 75;
                i.setX(recX); 
                i.setY(recY); 
                i.setWidth(recSize); 
                i.setHeight(recSize);      
                root.getChildren().add(i);
            }
        }
         
        //Creating a Group object  
        //Creating a scene object 
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
