package com.example.loginfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("registration.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 500);

        Image icon = new Image(Main.class.getResourceAsStream("/com/example/loginfx/icon.jpg"));

        stage.getIcons().add(icon);
        stage.setTitle("Login System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}