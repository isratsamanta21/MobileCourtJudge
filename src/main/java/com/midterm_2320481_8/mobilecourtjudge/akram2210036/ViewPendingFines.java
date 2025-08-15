package com.midterm_2320481_8.mobilecourtjudge.akram2210036;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewPendingFines {

    @FXML
    private Button RECORDPAYMENTButton;

    @FXML
    private TableColumn<?, ?> amountCol;

    @FXML
    private Button applyFilters;

    @FXML
    private Button backBtn11;

    @FXML
    private Button backButton;

    @FXML
    private TableColumn<?, ?> caseIdCol;

    @FXML
    private TableColumn<?, ?> dueDateCol;

    @FXML
    private TableView<?> finesTable;

    @FXML
    private TableColumn<?, ?> issuedDateCol;

    @FXML
    private TableColumn<?, ?> offenderCol;

    @FXML
    private TextArea offenderDetailsArea;

    @FXML
    private ComboBox<?> officerFilterCombo;

    @FXML
    private TextField searchField;

    @FXML
    private Label selectedFineLabel;

    @FXML
    private TableColumn<?, ?> statusCol;

    @FXML
    private ComboBox<?> statusFilterCombo;

    @FXML
    private Label statusLabel;

    @FXML
    private TextArea violationDetailsArea;

    @FXML
    void applyFiltersOnAction(ActionEvent event) {

    }

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
    void downloadFineSlipOnAction(ActionEvent event) {

    }

    @FXML
    void recordPaymentOnAction(ActionEvent event) {

    }

}
