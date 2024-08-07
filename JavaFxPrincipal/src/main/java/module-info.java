module org.example.javafxprincipal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.javafxprincipal to javafx.fxml;
    exports org.example.javafxprincipal;
}