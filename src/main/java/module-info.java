module lk.hasindu.spiceshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.hasindu.spiceshop to javafx.fxml;
    exports lk.hasindu.spiceshop;
    opens lk.hasindu.spiceshop.controller to javafx.fxml;
    exports lk.hasindu.spiceshop.controller;
}