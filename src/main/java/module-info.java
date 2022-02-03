module com.example.factory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.factory to javafx.fxml;
    exports com.example.factory;
}