package com.midterm_2320481_8.mobilecourtjudge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

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
    void backOnActionButton(ActionEvent event) {

    }

}
