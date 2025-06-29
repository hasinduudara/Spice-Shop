package lk.hasindu.spiceshop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class WelcomeController {

    @FXML
    private Button btnGetStart;

    @FXML
    private AnchorPane welcomePage;

    @FXML
    void btnGetStartOnAction(ActionEvent event) throws IOException {
        welcomePage.getChildren().clear();
        welcomePage.getChildren().add(FXMLLoader.load(getClass().getResource("/view/MainDashboard.fxml")));
    }

}
