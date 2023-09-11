package com.example.question2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane borderPane = new BorderPane();

        Scene scene = new Scene(borderPane, 800, 700);
        stage.setTitle("Password Generator");
        stage.setScene(scene);
        stage.show();
    }

    public VBox Background(){
        VBox frontText = new VBox();
        Font font1 = Font.font("Verdana", FontWeight.BOLD,30);
        Text discText1 = new Text("Are You Ready For");
        discText1.setFont(font1);
        discText1.setFill(Color.BLACK);

        Font font2 = Font.font("Verdana", FontWeight.EXTRA_BOLD,30);
        Text discText2 = new Text("The ADVENTURE");
        discText2.setFont(font2);
        discText2.setFill(Color.rgb(78, 78, 78));
        discText2.setStyle("-fx-background-color: rgba(255, 255, 255, 0.2)");

        Font font3 = Font.font("Verdana", FontWeight.BOLD,18);
        Text discText3 = new Text("What Kind of Challenges Await You?");
        discText3.setFont(font3);
        discText3.setFill(Color.WHEAT);

        Button startGame = new Button("Lets GO");
        Font font4 = Font.font("Verdana", FontWeight.BOLD,16);
        startGame.setFont(font4);
        startGame.setStyle("-fx-background-color: rgba(255, 255, 255, 0.2)");
        startGame.setMaxHeight(300);
        startGame.setMaxWidth(150);

        frontText.setSpacing(6);
        frontText.setPadding(new Insets(100, 0, 0, 100));
        frontText.getChildren().addAll(discText1, discText2, discText3, startGame);

        return frontText;
    }

    public static void main(String[] args) {
        launch();
    }
}