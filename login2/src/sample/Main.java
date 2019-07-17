package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, 300, 350);

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        scene.getStylesheets().add(this.getClass().getResource("Login.css").toExternalForm());

        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

