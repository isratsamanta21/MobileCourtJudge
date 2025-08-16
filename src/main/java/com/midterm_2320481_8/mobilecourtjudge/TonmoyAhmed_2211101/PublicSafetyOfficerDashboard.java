package com.midterm_2320481_8.mobilecourtjudge.TonmoyAhmed_2211101;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class PublicSafetyOfficerDashboard {

    @FXML
    private Button CrowdManagementButton;

    @FXML
    private Button EmergencyEvacuationButton;

    @FXML
    private Button LogComplaintButton;

    @FXML
    private Button ReportSuspiciousActivityButton;

    @FXML
    private Button SafetyZonesButton;

    @FXML
    private Button SecurityLogButton;

    @FXML
    private Button ViewComplaintStatusButton;

    @FXML
    void CrowdManagementButtonOnAction(ActionEvent event) {

    }

    @FXML
    void EmergencyEvacuationButtonOnAction(ActionEvent event) {

    }

    @FXML
    void LogComplaintButtonOnAction(ActionEvent event) {

    }

    @FXML
    void ReportSuspiciousActivityButtonOnAction(ActionEvent event) {

    }

    @FXML
    void SafetyZonesButtonOnAction(ActionEvent event) {

    }

    @FXML
    void SecurityLogButtonOnAction(ActionEvent event) {

    }

    @FXML
    void ViewComplaintStatusButtonOnAction(ActionEvent event) {

    }

    public static class assistinemergencyevaculation {

    @FXML
    private Button activateAlertButton;

    @FXML
    private Label affectedLabel;

    @FXML
    private Button backButton;

    @FXML
    private TextArea evacuationRouteArea;

    @FXML
    private ComboBox<?> locationAnchorPane;

    @FXML
    private ComboBox<?> typeAnchorPane;

    @FXML
    void activeAlertButtonOnAction(ActionEvent event) {

    }

    @FXML
    void backButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("assist_in_emergency_evaculation.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    }
}

