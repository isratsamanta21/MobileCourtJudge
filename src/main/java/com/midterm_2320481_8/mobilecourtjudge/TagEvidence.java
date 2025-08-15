
package com.midterm_2320481_8.mobilecourtjudge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TagEvidence {

    @FXML
    private Button backButton;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField caseIdField;

    @FXML
    private TableView<?> evidenceTable;

    @FXML
    private TableColumn<?, ?> fileNameCol;

    @FXML
    private TableColumn<?, ?> fileTypeCol;

    @FXML
    private TextField notesField;

    @FXML
    private ComboBox<?> officerComboBox;

    @FXML
    private TableColumn<?, ?> selectCol;

    @FXML
    private Label statusLabel;

    @FXML
    private Button tagevidenceButton;

    @FXML
    private TableColumn<?, ?> uploadDateCol;

    @FXML
    private Button validateButoon;

    @FXML
    void handleBack(ActionEvent event) {

    }

    @FXML
    void validateCaseId(ActionEvent event) {

    }

}
