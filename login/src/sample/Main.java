package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.text.Text;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(20);
        grid.setVgap(10);
        grid.setPadding(new Insets(5, 5, 5, 5));

        grid.setGridLinesVisible(false);

        Text sceneTitle = new Text("Welcome");
        //sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        sceneTitle.setId("welcome-text");
        grid.add(sceneTitle, 0, 0, 2,1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1 );

        Label userName = new Label("User Name");
        grid.add(userName, 0 , 1);

        Label pw = new Label("Password ");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        final Text actionTarget = new Text();
        actionTarget.setId("actiontarget-text");
        actionTarget.setTextAlignment(TextAlignment.CENTER);
        grid.add(actionTarget, 1, 6);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                //actionTarget.setFill(Color.DEEPPINK);
                actionTarget.setText("Sign-in button has been pressed.");
            }
        });


        Scene scene = new Scene(grid, 500, 300);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(this.getClass().getResource("Login.css").toExternalForm());

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
