package com.midterm_2320481_8.mobilecourtjudge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class RabOfficerDashboard {

    @FXML
    private Button LOGOUT;

    @FXML
    private Button approveCourt;

    @FXML
    private Button complaintList;

    @FXML
    private Button courtSchedule;

    @FXML
    private Button downloadReport;

    @FXML
    private Button myInvestigations;

    @FXML
    private Button requestEvidence;

    @FXML
    private Button submitFinalReport;

    @FXML
    private Button viewEvidence;

    @FXML
    void ApproveforCourtOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Approve_for_Court.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void ComplaintListOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Complaint_List.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void CourtScheduleOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Court_Schedule.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void DownloadReportOnAction(ActionEvent event) {

    }

    @FXML
    void LOGOUTOnAction(ActionEvent event) {

    }

    @FXML
    void RequestEvidenceOnAction(ActionEvent event) {

    }

    @FXML
    void SubmitFinalReportOnAction(ActionEvent event) {

    }

    @FXML
    void ViewEvidenceOnAction(ActionEvent event) {

    }

}
