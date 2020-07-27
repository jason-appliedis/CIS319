package GP3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MyWelcome  extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader root = new FXMLLoader(MyWelcome.class.getResource("MyWelcome.fxml"));
        Scene scene = new Scene(root.load()); // attach scene graph to scene
        stage.setTitle("Welcome"); // displayed in window's title bar
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
