module GP3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires transitive javafx.graphics;

    opens GP3 to javafx.fxml;
    exports GP3;
}