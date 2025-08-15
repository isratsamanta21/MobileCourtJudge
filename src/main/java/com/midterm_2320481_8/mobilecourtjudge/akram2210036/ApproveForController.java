package com.midterm_2320481_8.mobilecourtjudge.akram2210036;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ApproveForController {

    @FXML
    private Button BackButton;

    @FXML
    private TableColumn<?, ?> approvalStatusTC;

    @FXML
    private Button approveCaseButton;

    @FXML
    private TableColumn<?, ?> caseIdTC;

    @FXML
    private TableColumn<?, ?> caseTitleTC;

    @FXML
    private TableView<?> casesTV;

    @FXML
    private TableColumn<?, ?> evidenceStatusTC;

    @FXML
    private Label notificationLabel;

    @FXML
    private Button requestChangesButton;

    @FXML
    private Button reviewEvidenceButton;

    @FXML
    void approveCaseOnAction(ActionEvent event) {

    }

    @FXML
    void backonaction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Rab_Officer_Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void requestChangesOnAction(ActionEvent event) {

    }

    @FXML
    void reviewEvidenceOnAction(ActionEvent event) {

    }


}
