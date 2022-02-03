package com.example.factory;

import javafx.scene.control.Alert;

public class AmmoFactory {

    private static AmmoFactory instance = null;

    private AmmoFactory(){}

    public static synchronized AmmoFactory getInstance(){
        if(AmmoFactory.instance == null){
            AmmoFactory.instance = new AmmoFactory();
        }
        return AmmoFactory.instance;
    }

    public Alert createAlert(Alert.AlertType type, String title, String headerText, String contentText){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        return alert;
    }

    public Alert createAlert(Alert.AlertType type, String title, String headerText){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        return alert;
    }

}
