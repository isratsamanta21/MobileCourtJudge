package com.midterm_2320481_8.mobilecourtjudge.TonmoyAhmed_2211101;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckIDandPermitforEntry {

    @FXML
    private Button backButton;

    @FXML
    private Label caseAccessLabel;

    @FXML
    private Button denyButton;

    @FXML
    private Button grantEntryButton;

    @FXML
    private Label nameLabel;

    @FXML
    private ComboBox<?> qrCodeComboBox;

    @FXML
    private Label resultLabel;

    @FXML
    private Button scanNowCombox;

    @FXML
    private Label validIdLabel;

    @FXML
    void backButtonOnAction(ActionEvent event) {

    }

    @FXML
    void denyButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Check_ID_and_Permit_for_Entry.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void grantEntryButtonOnAction(ActionEvent event) {

    }

}
