package com.example.simulatingoperationsofarabmobilecourt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SubmitFinalReport {

    @FXML
    private Button UBMITVERDICT;

    @FXML
    private Button back;

    @FXML
    private Button browseFiles;

    @FXML
    private TableColumn<?, ?> caseIdCol;

    @FXML
    private TableColumn<?, ?> caseTitleCol;

    @FXML
    private TableColumn<?, ?> closeDateCol;

    @FXML
    private TableView<?> closedCasesTable;

    @FXML
    private TextArea finalRemarksArea;

    @FXML
    private Label selectedCaseLabel;

    @FXML
    private TextField selectedCasefield;

    @FXML
    private TableColumn<?, ?> statusCol;

    @FXML
    private Label statusLabel;

    @FXML
    void backOnAction(ActionEvent event) {

    }

    @FXML
    void browseFilesOnAction(ActionEvent event) {

    }

    @FXML
    void sUBMITVERDICTOnAction(ActionEvent event) {

    }

}
