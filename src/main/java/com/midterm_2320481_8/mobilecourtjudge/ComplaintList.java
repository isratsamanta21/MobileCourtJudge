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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class ComplaintList {

    @FXML
    private Button assingCaseButton;

    @FXML
    private Button backButton;

    @FXML
    private TableColumn<?, ?> caseIdCol;

    @FXML
    private TableColumn<?, ?> complainantCol;

    @FXML
    private TableView<?> complaintsTableView;

    @FXML
    private TableColumn<?, ?> dateCol;

    @FXML
    private ComboBox<?> dateRangeComboBox;

    @FXML
    private TextArea notesArea;

    @FXML
    private ComboBox<?> officerComboBox;

    @FXML
    private DatePicker startDatePicker;

    @FXML
    private Label statusLabel;

    @FXML
    private TableColumn<?, ?> typeCol;

    @FXML
    private ComboBox<?> typeFilterComboBox;

    @FXML
    void assingCaseOnAction(ActionEvent event) {

    }

    @FXML
    void backOnActionButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Rab_Officer_Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

}
