package week3.ge2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class MyTemperatureConverter extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
       FXMLLoader root = new FXMLLoader(MyTemperatureConverter.class.getResource("MyTemperatureConverter.fxml"));
       Scene scene = new Scene(root.load()); // attach scene graph to scene
       stage.setTitle("Temperature Converter"); // displayed in window's title bar
       stage.setScene(scene); // attach scene to stage
       stage.show(); // display the stage
 
    }

    public static void main(String[] args) {
        launch();
    }

}