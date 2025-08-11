package com.example.simulatingoperationsofarabmobilecourt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ExportMonthlyReport {

    @FXML
    private Button backButton;

    @FXML
    private Button exportButton;

    @FXML
    private TableColumn<?, ?> exportDateCol;

    @FXML
    private ComboBox<?> formatCombo;

    @FXML
    private Button generateButton;

    @FXML
    private TableColumn<?, ?> monthCol;

    @FXML
    private ComboBox<?> monthCombo;

    @FXML
    private TableColumn<?, ?> reportIdCol;

    @FXML
    private TableView<?> reportsTable;

    @FXML
    private Label statusLabel;

    @FXML
    private TableColumn<?, ?> totalFinesCol;

    @FXML
    private ComboBox<?> yearCombo;

    @FXML
    void backOnAction(ActionEvent event) {

    }

    @FXML
    void exportOnAction(ActionEvent event) {

    }

    @FXML
    void generateOnAction(ActionEvent event) {

    }

}
