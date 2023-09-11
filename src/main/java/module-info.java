module com.example.question2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.question2 to javafx.fxml;
    exports com.example.question2;
}