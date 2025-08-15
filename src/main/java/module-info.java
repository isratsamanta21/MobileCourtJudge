module com.midterm_2320481_8.mobilecourtjudge {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.midterm_2320481_8.mobilecourtjudge to javafx.fxml;
    exports com.midterm_2320481_8.mobilecourtjudge;
    exports com.midterm_2320481_8.mobilecourtjudge.akram2210036;
    opens com.midterm_2320481_8.mobilecourtjudge.akram2210036 to javafx.fxml;
}