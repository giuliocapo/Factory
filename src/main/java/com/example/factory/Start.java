package com.example.factory;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Start extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void createAmmo1(){
        AmmoFactory.getInstance().createAmmo("9","black","20");
        //("Ammo have been created" );
    }
    @FXML
    public void createAmmo2(){
        AmmoFactory.getInstance().createAmmo("9");
        //("Ammo have been created" );
    }
    @FXML
    public void createAmmo3(){
        AmmoFactory.getInstance().createAmmo("45", "gold");
        //("Ammo have been created" );
    }

    public static void main(String[] args) {
        launch();
    }
}