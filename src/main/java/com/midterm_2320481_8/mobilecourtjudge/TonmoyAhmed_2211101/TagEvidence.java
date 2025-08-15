
package com.midterm_2320481_8.mobilecourtjudge.TonmoyAhmed_2211101;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
