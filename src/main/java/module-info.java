module com.example.loginfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.loginfx to javafx.fxml;
    exports com.example.loginfx;
}