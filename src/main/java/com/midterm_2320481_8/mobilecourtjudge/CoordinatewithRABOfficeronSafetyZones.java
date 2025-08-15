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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CoordinatewithRABOfficeronSafetyZones {

    @FXML
    private Button backButton;

    @FXML
    private Button sendToRabButton;

    @FXML
    private ComboBox<?> sessionComboBox;

    @FXML
    private TextArea zoneMapArea;

    @FXML
    private TextField zoneMapTextField;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Coordinate_with_RAB_Officer_on_Safety_Zones.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void sendToRabButtonOnAction(ActionEvent event) {

    }

}
