package com.example.cookieclicker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class maincontroller {

    int limit = 0;
    int i = 0;
    int goalNum;
    @FXML
    private Label welcomeText;

    @FXML
    private Label goal;

    @FXML
    private Label randomLimit;

    @FXML
    private Label goalReach;

    private Random rd = new Random();

    @FXML
    protected void onCookieButtonClick() {
        i++;
        String s = String.format("%d", i);
        welcomeText.setText(s);
        if(i == goalNum){
            goalReach.setText("GOAL REACH");
        }
    }

    @FXML
    protected void onResetButtonClick(){
        goalNum = rd.nextInt(limit);
        String s = String.format("%d", goalNum);
        goal.setText(s);
    }
    @FXML
    protected void plusGoalButton(){
        limit += 10;
        String s = String.format("%d", limit);
        randomLimit.setText(s);
    }

    @FXML
    protected void minusGoalButton(){
        limit -= 10;
        String s = String.format("%d", limit);
        randomLimit.setText(s);
    }







}