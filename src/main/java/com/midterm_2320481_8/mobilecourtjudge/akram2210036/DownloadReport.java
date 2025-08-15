package com.midterm_2320481_8.mobilecourtjudge.akram2210036;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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
    void backOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Rab_Officer_Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


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
