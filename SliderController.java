package com.example.colorsliderprogram;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SliderController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Color Slider Program");
    }
}
