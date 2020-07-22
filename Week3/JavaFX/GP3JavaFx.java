import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class GP3JavaFx extends Application {
    
    @Override 
    public void start(Stage primaryStage){
        BorderPane myPane = new BorderPane(); 
        Text myName = new Text("Jason");
        
        myName.setFont(Font.font("Calibri",45));
        myName.setEffect(new DropShadow());
        myName.setEffect(new DropShadow(10,10,10,Color.BLUE));

        myPane.setCenter(myName);
        primaryStage.setScene(new Scene(myPane));


        primaryStage.sizeToScene(); 
        primaryStage.show();
        
    }

    public static void main(String[] args){
        launch(args);
    }

   
}