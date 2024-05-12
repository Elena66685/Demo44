module com.example.demo44 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo44 to javafx.fxml;
    exports com.example.demo44;
}