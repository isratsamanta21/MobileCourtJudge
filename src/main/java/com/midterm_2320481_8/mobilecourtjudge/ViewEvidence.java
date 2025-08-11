package com.example.simulatingoperationsofarabmobilecourt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewEvidence {

    @FXML
    private Button BACKButton;

    @FXML
    private Button DOWNLOADSELECTEDButton;

    @FXML
    private Button LOADEVIDENCEButton;

    @FXML
    private TableColumn<?, ?> actionsCol;

    @FXML
    private ComboBox<?> caseComboBox;

    @FXML
    private TableColumn<?, ?> dateCol;

    @FXML
    private TableView<?> evidenceTableView;

    @FXML
    private TableColumn<?, ?> fileNameCol;

    @FXML
    private TableColumn<?, ?> sizeCol;

    @FXML
    private Label statusLabel;

    @FXML
    private TableColumn<?, ?> typeCol;

    @FXML
    void BACKOnAction(ActionEvent event) {

    }

    @FXML
    void DOWNLOADSELECTEDOnAction(ActionEvent event) {

    }

    @FXML
    void lOADEVIDENCEOnAction(ActionEvent event) {

    }

}
