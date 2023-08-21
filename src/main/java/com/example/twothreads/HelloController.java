package com.example.twothreads;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class HelloController {

    @FXML
    private Button threadAButton;

    @FXML
    private Button threadBButton;


    @FXML
    private TableView outputTable;


    @FXML
    protected void onThreadAButtonClick() {
        System.out.println("onThreadAButtonClick");
        Generator generator = new Generator(10);
        generator.start();

    }

    @FXML
    protected void onThreadBButtonClick() {
        System.out.println("onThreadBButtonClick");
        Generator generator = new Generator(10);
        generator.start();
    }
}