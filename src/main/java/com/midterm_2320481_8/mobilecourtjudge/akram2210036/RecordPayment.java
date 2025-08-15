package com.midterm_2320481_8.mobilecourtjudge.akram2210036;

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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
    void backOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Fine_Collector_Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void submitOnAction(ActionEvent event) {

    }

}
