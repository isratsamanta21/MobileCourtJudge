package com.midterm_2320481_8.mobilecourtjudge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class COLLECTFIELDEVIDENCE {

    @FXML
    private TableColumn<?, ?> actionsColumn;

    @FXML
    private Button addaudrioButton;

    @FXML
    private Button addphotoButton;

    @FXML
    private Button addvideoButton;

    @FXML
    private Button backButton;

    @FXML
    private Button cancelButton;

    @FXML
    private ComboBox<?> caseComboBox;

    @FXML
    private Label caseidlabel;

    @FXML
    private TextArea descriptionArea;

    @FXML
    private TableView<?> evidenceTable;

    @FXML
    private TableColumn<?, ?> fileNameColumn;

    @FXML
    private Button refreshlistButton;

    @FXML
    private TableColumn<?, ?> sizeColumn;

    @FXML
    private Label statusLabel;

    @FXML
    private TableColumn<?, ?> typeColumn;

    @FXML
    private Button uploadevifenceButton;

    @FXML
    void refreshCaseList(ActionEvent event) {

    }

}
