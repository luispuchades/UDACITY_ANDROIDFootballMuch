package com.example.android.footballmuch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables declaration and initialization
    //****************************************

    //Team A goals
    int goalsTeamA = 0;
    //Team B goals
    int goalsTeamB = 0;
    //Team A Kick To Goal
    int kickToGoalTeamA = 0;
    //Team B Kick To Goal
    int kickToGoalTeamB = 0;
    //Team A Passes Success
    int passesSuccessTeamA = 0;
    //Team A Passes Success
    int passesSuccessTeamB = 0;
    //Team A Passes Failed
    int passesFailedTeamA = 0;
    //Team A Passes Failed
    int passesFailedTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Event declaration
    //*****************
    public void addGoalTeamA(View view) {
        goalsTeamA = goalsTeamA + 1;
        displayGoalsTeamA(goalsTeamA);
    }

    public void addGoalTeamB(View view) {
        goalsTeamB = goalsTeamB + 1;
        displayGoalsTeamB(goalsTeamB);
    }

    public void addKickToGoalTeamA(View view) {
        kickToGoalTeamA = kickToGoalTeamA + 1;
        displayKickToGoalTeamA(kickToGoalTeamA);

    }

    public void addKickToGoalTeamB(View view) {
        kickToGoalTeamB = kickToGoalTeamB + 1;
        displayKickToGoalTeamB(kickToGoalTeamB);
    }

    public void addPassesSuccessTeamA(View view) {
        passesSuccessTeamA = passesSuccessTeamA + 1;
        displayPassesSuccessTeamA(passesSuccessTeamA);
    }

    public void addPassesSuccessTeamB(View view) {
        passesSuccessTeamB = passesSuccessTeamB + 1;
        displayPassesSuccessTeamB(passesSuccessTeamB);
    }

    public void addPassesFailedTeamA(View view) {
        passesFailedTeamA = passesFailedTeamA + 1;
        displayPassesFailedTeamA(passesFailedTeamA);
    }

    public void addPassesFailedTeamB(View view) {
        passesFailedTeamB = passesFailedTeamB + 1;
        displayPassesFailedTeamB(passesFailedTeamB);
    }

    //Reset Button
    //************
    public void resetScores(View view) {
        //Buttons variables reset
        goalsTeamA = 0;
        goalsTeamB = 0;
        kickToGoalTeamA = 0;
        kickToGoalTeamB = 0;
        passesSuccessTeamA = 0;
        passesSuccessTeamB = 0;
        passesFailedTeamA = 0;
        passesFailedTeamB = 0;

        //Statistics variables reset

        //Score reset
        displayGoalsTeamA(goalsTeamA);
        displayGoalsTeamB(goalsTeamB);
        displayKickToGoalTeamA(kickToGoalTeamA);
        displayKickToGoalTeamB(kickToGoalTeamB);
        displayPassesSuccessTeamA(passesSuccessTeamA);
        displayPassesSuccessTeamB(passesSuccessTeamB);
        displayPassesFailedTeamA(passesFailedTeamA);
        displayPassesFailedTeamB(passesFailedTeamB);
    }

    //Button event capture and definition
    //***********************************

    public void displayGoalsTeamA(int score) {
        TextView goalsView = (TextView) findViewById(R.id.scoreGoalsTeamA);
        goalsView.setText(String.valueOf(score));
    }

    public void displayGoalsTeamB(int score) {
        TextView goalsView = (TextView) findViewById(R.id.scoreGoalsTeamB);
        goalsView.setText(String.valueOf(score));
    }

    public void displayKickToGoalTeamA(int score) {
        TextView kickToGoalView = (TextView) findViewById(R.id.kickToGoalTeamA);
        kickToGoalView.setText(String.valueOf(score));
    }

    public void displayKickToGoalTeamB(int score) {
        TextView kicktoGoalView = (TextView) findViewById(R.id.kickToGoalTeamB);
        kicktoGoalView.setText(String.valueOf(score));
    }

    public void displayPassesSuccessTeamA(int score) {
        TextView passesSuccessView = (TextView) findViewById(R.id.passesSucessTeamA);
        passesSuccessView.setText(String.valueOf(score));
    }

    public void displayPassesSuccessTeamB(int score) {
        TextView passesSuccessView = (TextView) findViewById(R.id.passesSucessTeamB);
        passesSuccessView.setText(String.valueOf(score));
    }

    public void displayPassesFailedTeamA(int score) {
        TextView passesFailedView = (TextView) findViewById(R.id.passesFailedTeamA);
        passesFailedView.setText(String.valueOf(score));
    }

    public void displayPassesFailedTeamB(int score) {
        TextView passesFailedView = (TextView) findViewById(R.id.passesFailedTeamB);
        passesFailedView.setText(String.valueOf(score));
    }
}
