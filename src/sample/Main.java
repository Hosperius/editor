package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Edytor textu byczq");
        primaryStage.setScene(new Scene(root, 1200, 900));
        primaryStage.show();
        StackPane stackPane = new StackPane();
        Button button = new Button();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
