package com.midterm_2320481_8.mobilecourtjudge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CourtSchedule {

    @FXML
    private Button backButton;

    @FXML
    private TableColumn<?, ?> caseIdTC;

    @FXML
    private TableColumn<?, ?> caseTitleTC;

    @FXML
    private Button clearButton;

    @FXML
    private TableColumn<?, ?> dateTC;

    @FXML
    private TableColumn<?, ?> locationTC;

    @FXML
    private Button printScheduleButton;

    @FXML
    private TableView<?> scheduleTV;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchField;

    @FXML
    private TableColumn<?, ?> timeTC;

    @FXML
    private Button viewDetailsButton;

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
    void clearOnAction(ActionEvent event) {

    }

    @FXML
    void printScheduleOnAction(ActionEvent event) {

    }

    @FXML
    void searchOnAction(ActionEvent event) {

    }

    @FXML
    void viewDetailsOnAction(ActionEvent event) {

    }

}
