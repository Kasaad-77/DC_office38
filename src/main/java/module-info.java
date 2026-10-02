module com.example.dc_office38 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dc_office38 to javafx.fxml;
    exports com.example.dc_office38;
}