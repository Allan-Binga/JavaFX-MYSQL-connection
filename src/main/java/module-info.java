module com.example.loginfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;


    opens com.example.loginfx to javafx.fxml;
    exports com.example.loginfx;
}