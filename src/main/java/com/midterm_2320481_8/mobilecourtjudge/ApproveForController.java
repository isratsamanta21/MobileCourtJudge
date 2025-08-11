package com.example.simulatingoperationsofarabmobilecourt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
    void backonaction(ActionEvent event) {

    }

    @FXML
    void requestChangesOnAction(ActionEvent event) {

    }

    @FXML
    void reviewEvidenceOnAction(ActionEvent event) {

    }

}
