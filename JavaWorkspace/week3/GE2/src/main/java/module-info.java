module week3.ge2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires transitive javafx.graphics;

    opens week3.ge2 to javafx.fxml;
    exports week3.ge2;
}