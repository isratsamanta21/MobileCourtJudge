package com.example.simulatingoperationsofarabmobilecourt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SendOfficialNotice {

    @FXML
    private Button PreviewNoticeButton;

    @FXML
    private TableColumn<?, ?> amountCol;

    @FXML
    private Button backButton;

    @FXML
    private TableColumn<?, ?> caseIdCol;

    @FXML
    private ComboBox<?> deliveryMethodCombo;

    @FXML
    private TableColumn<?, ?> dueDateCol;

    @FXML
    private TableView<?> finesTable;

    @FXML
    private TextField noticeTitleField;

    @FXML
    private ComboBox<?> noticeTypeCombo;

    @FXML
    private TableColumn<?, ?> offenderCol;

    @FXML
    private Button sendNoticeButton;

    @FXML
    private TableColumn<?, ?> statusCol;

    @FXML
    private Label statusLabel;

    @FXML
    void PreviewNoticeOnAction(ActionEvent event) {

    }

    @FXML
    void backOnAction(ActionEvent event) {

    }

    @FXML
    void sendNoticeOnAction(ActionEvent event) {

    }

}
