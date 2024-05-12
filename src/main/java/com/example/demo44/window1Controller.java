package com.example.demo44;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class window1Controller {

    @FXML
    private Button knobs2;

    @FXML
    private Button knobs3;

    @FXML
    private Label knobs11;

public void newWindow1() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("window2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)knobs2.getScene().getWindow();
        stage.setTitle("Телега программиста Java!");
        stage.setScene(scene);
        stage.show();
    }

    public void newWindow12() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("window3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)knobs3.getScene().getWindow();
        stage.setTitle("Телега кодера!");
        stage.setScene(scene);
        stage.show();
    }

    public void on()
    {
        knobs11.setText("Люди которые придумали синтетические шнурки не правы! В.М.Дёмкин");
    }

}