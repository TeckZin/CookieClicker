module com.example.cookieclicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cookieclicker to javafx.fxml;
    exports com.example.cookieclicker;
}