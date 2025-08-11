package com.midterm_2320481_8.mobilecourtjudge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class SendReminders {

    @FXML
    private TableColumn<?, ?> amountCol;

    @FXML
    private Button backButton;

    @FXML
    private TableColumn<?, ?> caseIdCol;

    @FXML
    private TableColumn<?, ?> dueDateCol;

    @FXML
    private TextArea messageArea;

    @FXML
    private TableColumn<?, ?> offenderCol;

    @FXML
    private TableView<?> overdueFinesTable;

    @FXML
    private ComboBox<?> reminderTypeCombobox;

    @FXML
    private Button sendButton;

    @FXML
    private Label statusLabel;

    @FXML
    void backOnAction(ActionEvent event) {

    }

    @FXML
    void sendOnAction(ActionEvent event) {

    }

}
