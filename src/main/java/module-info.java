module com.example.sistema_bancario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sistema_bancario to javafx.fxml;
    exports com.example.sistema_bancario;
}