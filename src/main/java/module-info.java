module com.example.javafxtechstore {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtechstore to javafx.fxml;
    exports com.example.javafxtechstore;
}