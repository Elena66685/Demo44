package com.example.demo44;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Window2Controller
{
    @FXML
    private Button knobs21;

    @FXML
    private Button knobs23;

    public void newWindow21() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("window1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)knobs21.getScene().getWindow();
        stage.setTitle("Телега программиста С++!");
        stage.setScene(scene);
        stage.show();
    }

    public void newWindow23() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("window3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)knobs23.getScene().getWindow();
        stage.setTitle("Телега кодера!");
        stage.setScene(scene);
        stage.show();
    }
}
