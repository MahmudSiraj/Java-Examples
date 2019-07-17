import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) {
        // creating the button and it's event handling
        Button btn = new Button();
        btn.setText("Say Hello World!");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello world!");
            }
        });

        StackPane root = new StackPane();

        // add button to hierarchy
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
