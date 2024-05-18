module com.example.wahida_siemens {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.wahida_siemens to javafx.fxml;
    exports com.example.wahida_siemens;
}