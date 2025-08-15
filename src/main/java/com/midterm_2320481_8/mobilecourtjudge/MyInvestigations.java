package com.example.simulatingoperationsofarabmobilecourt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MyInvestigations {

    @FXML
    private Button ADDFILESButton;

    @FXML
    private Button BACKButton;

    @FXML
    private TableColumn<?, ?> InvestigationTitleCol;

    @FXML
    private TextField InvestigationTitleTextField;

    @FXML
    private Button SUBMITREPORTButton;

    @FXML
    private TextField SelectedCaseTextField;

    @FXML
    private ListView<?> attachmentsList;

    @FXML
    private TableColumn<?, ?> caseIdCol;

    @FXML
    private TableView<?> casesTable;

    @FXML
    private Label selectedCaseLabel;

    @FXML
    private TableColumn<?, ?> statusCol;

    @FXML
    private Label statusLabel;

    @FXML
    void AddFileOnAction(ActionEvent event) {

    }

    @FXML
    void BACKOnAction(ActionEvent event) {

    }

    @FXML
    void SUBMITREPORTOnAction(ActionEvent event) {

    }

}
