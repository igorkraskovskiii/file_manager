package com.igorkraskovski.file.manager;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    TableView filesTable;

    public void btnExitAction(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void initialize(URL location, ResourceBundle resources) {

    }
}