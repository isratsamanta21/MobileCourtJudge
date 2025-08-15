package com.midterm_2320481_8.mobilecourtjudge.TonmoyAhmed_2211101;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.io.IOException;

public class SafetyZoneCoordination {

    @FXML
    private Button ApprovalRequestbutton;

    @FXML
    private Button BackButton;

    @FXML
    private TableColumn<?, ?> radiusTableColumn;

    @FXML
    void ApprovalRequestbuttonOnAction(ActionEvent event) {

    }

    @FXML
    void BackButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Safety_Zone_Coordination.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();



    }

}
