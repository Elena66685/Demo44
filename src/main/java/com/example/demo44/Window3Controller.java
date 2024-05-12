package com.example.demo44;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Window3Controller {

    @FXML
    private Button knobs31;

    @FXML
    private Button knobs32;

    @FXML
    private Label lab;

    public void newWindow31() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("window1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)knobs31.getScene().getWindow();
        stage.setTitle("Телега программиста С++!");
        stage.setScene(scene);
        stage.show();
    }

    public void newWindow32() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("window2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)knobs32.getScene().getWindow();
        stage.setTitle("Телега программиста Java!");
        stage.setScene(scene);
        stage.show();
    }

    public void on()
    {
        lab.setText("Ты не олимпиадник! Чем котов кормить будешь?!!!");

    }
}
