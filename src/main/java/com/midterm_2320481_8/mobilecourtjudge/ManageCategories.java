package com.example.simulatingoperationsofarabmobilecourt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ManageCategories {

    @FXML
    private Button addCategoryButton;

    @FXML
    private TableColumn<?, ?> amountCol;

    @FXML
    private TextField amountField;

    @FXML
    private Button backButton;

    @FXML
    private TableView<?> categoriesTable;

    @FXML
    private TableColumn<?, ?> categoryIdCol;

    @FXML
    private Button deactivateButton;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<?, ?> statusCol;

    @FXML
    private Label statusLabel;

    @FXML
    private Button updateButton;

    @FXML
    void addCategoryOnAction(ActionEvent event) {

    }

    @FXML
    void backOnAction(ActionEvent event) {

    }

    @FXML
    void deactivateOnAction(ActionEvent event) {

    }

    @FXML
    void updateOnAction(ActionEvent event) {

    }

}
