package edu.asu.ASUHelloWorldJavaFXMaven;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HelloFX extends Application {

    public void start(Stage primaryStage) {
    	System.out.println("ASU Hello World!");
    	System.out.println("It started!");
        primaryStage.setTitle("Emily Ngoc Do Hello World Fall 2024");
        Button btn = new Button();
        btn.setText("Display: 'Emily says: Hello World!'");
        btn.setOnAction(new EventHandler<>() {
            public void handle(ActionEvent event) {
                System.out.println("Emily says: Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}