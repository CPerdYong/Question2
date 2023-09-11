package com.example.question2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        // Text field for Enter words
        Label label1 = new Label("Enter Words: ");
        TextField text1 = new TextField();
        text1.setPrefWidth(250);
        text1.setMaxWidth(250);

        //Generate Password Button
        Button button1 =new Button();
        button1.setText("Generate Password");

        // Text field for Password
        Label label2 = new Label("Use This Password: ");
        TextField text2 = new TextField();

        gridPane.add(label1,1, 1, 1,1);
        gridPane.add(text1, 3,1,1, 1);
        gridPane.add(button1,3,2,1,1);
        gridPane.add(label2,1, 3, 1,1);
        gridPane.add(text2, 3,3,1, 1);

        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setHgap(30);
        gridPane.setVgap(20);

        Scene scene = new Scene(gridPane, 500, 200);

        primaryStage.setTitle("Text Field Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}