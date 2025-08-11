package com.example.simulatingoperationsofarabmobilecourt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class DownloadReport {

    @FXML
    private Button back;

    @FXML
    private TextField caseIDField;

    @FXML
    private Label caseIdLabel;

    @FXML
    private TextField dateField;

    @FXML
    private Label dateLabel;

    @FXML
    private TextField durationField;

    @FXML
    private Label durationLabel;

    @FXML
    private RadioButton excelRadio;

    @FXML
    private Button generateReport;

    @FXML
    private TextField judgeField;

    @FXML
    private Label judgeLabel;

    @FXML
    private Button loadSession;

    @FXML
    private RadioButton pDFRadio1;

    @FXML
    private TextField reportTitleField;

    @FXML
    private ComboBox<?> sessionComboBox;

    @FXML
    private Label statusLabel;

    @FXML
    private RadioButton wordRadio;

    @FXML
    void backOnAction(ActionEvent event) {

    }

    @FXML
    void generateReportOnAction(ActionEvent event) {

    }

    @FXML
    void loadSessionOnAction(ActionEvent event) {

    }

    @FXML
    void sessionOnAction(ActionEvent event) {

    }

}
