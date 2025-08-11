package com.example.simulatingoperationsofarabmobilecourt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class GenerateReports {

    @FXML
    private Button backButton;

    @FXML
    private DatePicker endDatePicker;

    @FXML
    private Button generateButton;

    @FXML
    private TableColumn<?, ?> generatedDateCol;

    @FXML
    private ComboBox<?> officerCombo;

    @FXML
    private TableColumn<?, ?> periodCol;

    @FXML
    private TableColumn<?, ?> reportIdCol;

    @FXML
    private ComboBox<?> reportTypeCombo;

    @FXML
    private TableView<?> reportsTable;

    @FXML
    private DatePicker startDatePicker1;

    @FXML
    private Label statusLabel;

    @FXML
    private TableColumn<?, ?> totalFinesCol;

    @FXML
    void backOnaction(ActionEvent event) {

    }

    @FXML
    void generateOnAction(ActionEvent event) {

    }

}
