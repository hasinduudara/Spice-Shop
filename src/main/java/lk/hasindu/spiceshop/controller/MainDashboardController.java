package lk.hasindu.spiceshop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainDashboardController implements Initializable {

    @FXML
    private AnchorPane AnchorPaneLoadDashboard;

    @FXML
    private Button btnReportsDashboard;

    @FXML
    private Button btnSalesDashboard;

    @FXML
    private Button btnSatockDashBoard;

    @FXML
    private AnchorPane mainDashboard;

    @FXML
    void btnReportsDashboardOnAction(ActionEvent event) {

    }

    @FXML
    void btnSalesDashboardOnAction(ActionEvent event) {

    }

    @FXML
    void btnSatockDashBoardOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        navigateTo("/view/StockDashboard.fxml");
    }

    public void navigateTo(String fxmlPath) {
        try {
            AnchorPaneLoadDashboard.getChildren().clear();
            AnchorPane load = FXMLLoader.load(getClass().getResource(fxmlPath));
            AnchorPaneLoadDashboard.getChildren().add(load);
        } catch (IOException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Fail to load page!").show();
        }
    }
}
