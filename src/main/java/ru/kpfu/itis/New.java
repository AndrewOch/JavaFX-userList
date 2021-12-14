package ru.kpfu.itis;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class New {
    public AnchorPane root;
    public Label mainTitle;
    public Button mainButton;
    @FXML
    private Button btn;
    @FXML
    private TextArea text;

    @FXML
    public void btn_click(){
        text.setText("Hello World");
    }

}