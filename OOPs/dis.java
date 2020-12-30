package examples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;



public class dis extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Display an Image");
        // Use a FlowPane for the root node.
        FlowPane rootNode = new FlowPane();
        // Use center alignment.
        rootNode.setAlignment(Pos.CENTER);
        // Create a scene.
        Scene myScene = new Scene(rootNode, 500, 500);
        // Set the scene on the stage.
        primaryStage.setScene(myScene);
        // Create an image.
        Image camera=new Image("file:camera.jpg");
        // Create an image view that uses the image.
        ImageView cameraV = new ImageView(camera);
        // Add the image to the scene graph.
        Label l=new Label("Hi");
        rootNode.getChildren().addAll(cameraV,l);
        // Show the stage and its scene.
        primaryStage.show();
    }
}
