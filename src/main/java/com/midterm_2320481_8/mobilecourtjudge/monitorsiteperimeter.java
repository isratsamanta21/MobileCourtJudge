package com.midterm_2320481_8.mobilecourtjudge;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class monitorsiteperimeter {

    @FXML
    private Button attachButton;

    @FXML
    private Button backButton;

    @FXML
    private ComboBox<?> complaintTypeCombobox;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private ComboBox<?> locationCombox;

    @FXML
    private Button submitButton;

    @FXML
    void attachPhotoOnAction(ActionEvent event) {

    }

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("monitor_site_perimeter.fxml"));
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
