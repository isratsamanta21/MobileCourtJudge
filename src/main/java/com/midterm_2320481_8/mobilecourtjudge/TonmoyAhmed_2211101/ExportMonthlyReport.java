package com.midterm_2320481_8.mobilecourtjudge.TonmoyAhmed_2211101;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

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
    void backOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Fine_Collector_Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void exportOnAction(ActionEvent event) {

    }

    @FXML
    void generateOnAction(ActionEvent event) {

    }

}
