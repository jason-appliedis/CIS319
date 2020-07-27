module CIS319 {
    requires javafx.controls;
    requires javafx.fxml;

    opens CIS319 to javafx.fxml;
    exports CIS319;
}