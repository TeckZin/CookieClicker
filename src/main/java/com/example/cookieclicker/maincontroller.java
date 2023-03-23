package com.example.cookieclicker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class maincontroller {

    int i = 0;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onCookieButtonClick() {
        i++;
        String s = String.format("%d", i);
        welcomeText.setText(s);
    }

    @FXML
    protected void onResetButtonClick(){
        i = 0;
        String s = String.format("%d", i);
        welcomeText.setText(s);
    }
}