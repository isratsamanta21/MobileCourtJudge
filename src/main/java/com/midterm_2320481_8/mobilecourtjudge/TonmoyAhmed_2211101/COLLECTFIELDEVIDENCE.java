package com.midterm_2320481_8.mobilecourtjudge.TonmoyAhmed_2211101;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
