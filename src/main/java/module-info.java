module com.example.question2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.question2 to javafx.fxml;
    exports com.example.question2;
}