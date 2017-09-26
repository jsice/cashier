package ku.cs.duckdealer.cashier.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.layout.FlowPane;

public class MainPaneController {

    private MainController mainCtrl;
    private FlowPane mainPane;
    @FXML
    private FlowPane leftPane, rightPane;


    public FlowPane getMainPane() {
        return mainPane;
    }

    public void setMainPane(FlowPane mainPane) {
        this.mainPane = mainPane;
    }

    public FlowPane getLeftPane() {
        return leftPane;
    }

    public FlowPane getRightPane() {
        return rightPane;
    }


    public void setMainCtrl(MainController mainCtrl) {
        this.mainCtrl = mainCtrl;
    }
}