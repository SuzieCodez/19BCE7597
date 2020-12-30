package examples;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class imageDisp extends Application {

    Label dispMsg;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Picture Button");
        FlowPane root=new FlowPane(10,10);
        root.setAlignment(Pos.CENTER);
        Scene myScene=new Scene(root,600,600);
        primaryStage.setScene(myScene);

        dispMsg=new Label("Push one of the buttons");

        Button home=new Button("Home",new ImageView("file:home.jpg"));
        Button camera=new Button("Camera", new ImageView("file:camera.jpg"));

        home.setContentDisplay(ContentDisplay.TOP);
        camera.setContentDisplay(ContentDisplay.TOP);

        home.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                dispMsg.setText("Home button has been pressed!");
            }
        });
        camera.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                dispMsg.setText("Camera button has been pressed!");
            }
        });
        root.getChildren().addAll(home,camera,dispMsg);
        primaryStage.show();
    }
}
