package com.example.simulatingoperationsofarabmobilecourt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    void backOnAction(ActionEvent event) {

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
