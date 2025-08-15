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
import javafx.stage.Stage;

import java.io.IOException;

public class RecordSecurityLogandHandover {

    @FXML
    private Button BackButton;

    @FXML
    private DatePicker DateDatePicker;

    @FXML
    private Label dateLabel;

    @FXML
    private TableColumn<?, ?> descriptionTableColumn;

    @FXML
    private Button generateReportButton;

    @FXML
    private Label logEntriesLabel;

    @FXML
    private ComboBox<?> shiftComboBox;

    @FXML
    private Label shiftLabel;

    @FXML
    private TableColumn<?, ?> timeTableColumn;

    @FXML
    void BackButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Record_Security_Log_and_Handover_Report5.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void generateReportButtonOnAction(ActionEvent event) {

    }

}
