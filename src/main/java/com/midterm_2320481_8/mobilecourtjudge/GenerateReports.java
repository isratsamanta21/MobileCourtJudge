package com.midterm_2320481_8.mobilecourtjudge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

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
    void backOnaction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Fine_Collector_Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void generateOnAction(ActionEvent event) {

    }

}
