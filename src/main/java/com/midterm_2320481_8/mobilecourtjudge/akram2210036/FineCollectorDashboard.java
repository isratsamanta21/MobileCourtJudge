package com.midterm_2320481_8.mobilecourtjudge.akram2210036;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class FineCollectorDashboard {

    @FXML
    private Button exportReportButton;

    @FXML
    private Button generateReportsButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button manageCategoriesButton;

    @FXML
    private Button recordPaymentButton;

    @FXML
    private Button sendNoticeButton;

    @FXML
    private Button sendRemindersButton;

    @FXML
    private Button updateStatusButton;

    @FXML
    private Button viewPendingFinesButton;

    @FXML
    void exportReportOnAction(ActionEvent event) {

    }

    @FXML
    void generateReportsOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Generate_Reports.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void logOutOnAction(ActionEvent event) {

    }

    @FXML
    void recordPaymentOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Record_Payment.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void sendNoticeOnAction(ActionEvent event) {

    }

    @FXML
    void sendRemindersOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Send_Reminders.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();



    }

    @FXML
    void updateStatusOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Update_Payments.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();



    }

    @FXML
    void viewPendingFinesOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View_Pending_Fines.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    public void ManageCategoriesOnAction(ActionEvent actionEvent) {
    }
}
