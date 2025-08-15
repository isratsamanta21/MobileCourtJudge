
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SecurityLogReport {

    @FXML
    private Button AttachButton;

    @FXML
    private ComboBox<?> AttachComboBox;

    @FXML
    private Button BackButton;

    @FXML
    private Button SubmitReportButton;

    @FXML
    void AttachButtonOnAction(ActionEvent event) {

    }

    @FXML
    void BackButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Security_Log_&_Report.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void SubmitReportButtonOnAction(ActionEvent event) {

    }

}
