package com.example.simulatingoperationsofarabmobilecourt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RecordPayment {

    @FXML
    private TableColumn<?, ?> amountCol;

    @FXML
    private Button backbutton;

    @FXML
    private TableColumn<?, ?> caseIdCol;

    @FXML
    private TableView<?> finesTable;

    @FXML
    private TableColumn<?, ?> offenderCol;

    @FXML
    private TextField paymentAmountField;

    @FXML
    private DatePicker paymentDatePicker;

    @FXML
    private ComboBox<?> paymentMethodCombo;

    @FXML
    private TextField referenceField;

    @FXML
    private TableColumn<?, ?> statusCol;

    @FXML
    private Label statusLabel;

    @FXML
    private Button submitButton;

    @FXML
    void backOnAction(ActionEvent event) {

    }

    @FXML
    void submitOnAction(ActionEvent event) {

    }

}
