package com.midterm_2320481_8.mobilecourtjudge.TonmoyAhmed_2211101;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ReportSuspiciousActivity {

    @FXML
    private Button attachEvidenceButton;

    @FXML
    private Button backButton;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private TextField locationTextField;

    @FXML
    private DatePicker reportsuspeciousactivityDatePicker;

    @FXML
    private Button submitReportButton;

    @FXML
    void attachEvidenceOnAction(ActionEvent event) {

    }

    @FXML
    void backButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("report_suspicious_activity.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void submitReportButtonOnAction(ActionEvent event) {

    }

}

