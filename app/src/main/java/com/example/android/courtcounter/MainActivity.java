package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    // Score of team  A
    int goalsHost = 0;
    int faultsHost = 0;
    int shotsHost = 0;

    // Score of team B
    int goalsVisitor = 0;
    int faultsVisitor = 0;
    int shotsVisitor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addGoalHost(View v) {
        goalsHost = goalsHost + 1;
        displayGoalsHost(goalsHost);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addGoalVisitor(View v) {
        goalsVisitor = goalsVisitor + 1;
        displayGoalsVisitor(goalsVisitor);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addFaultHost(View v) {
        faultsHost = faultsHost + 1;
        displayFaultsHost(faultsHost);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addFaultsVisitor(View v) {
        faultsVisitor = faultsVisitor + 1;
        displayFaultsVisitor(faultsVisitor);
    }


    /**
     * Increase the score for Team A by 3 points.
     */
    public void addShotHost(View v) {
        shotsHost = shotsHost + 1;
        displayShotHost(shotsHost);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addShotVisitor(View v) {
        shotsVisitor = shotsVisitor + 1;
        displayShotVisitor(shotsVisitor);
    }

    /**
     * Reset both teams score.
     */
    public void reset(View v) {
        goalsHost = 0;
        faultsHost = 0;
        shotsHost = 0;
        goalsVisitor = 0;
        faultsVisitor = 0;
        shotsVisitor = 0;

        displayGoalsHost(goalsHost);
        displayFaultsHost(faultsHost);
        displayShotHost(shotsHost);
        displayGoalsVisitor(goalsVisitor);
        displayFaultsVisitor(faultsVisitor);
        displayShotVisitor(shotsVisitor);
    }

    /**
     * Displays the given score for Host.
     */
    public void displayGoalsHost(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the faults for Host.
     */
    public void displayFaultsHost(int faults) {
        TextView scoreView = (TextView) findViewById(R.id.faults_stat_h);
        scoreView.setText(String.valueOf(faults));
    }

    /**
     * Displays the shots for Host.
     */
    public void displayShotHost(int shots) {
        TextView scoreView = (TextView) findViewById(R.id.shots_stat_h);
        scoreView.setText(String.valueOf(shots));
    }

    /**
     * Displays the given score for Visitor.
     */
    public void displayGoalsVisitor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Visitor.
     */
    public void displayFaultsVisitor(int faults) {
        TextView scoreView = (TextView) findViewById(R.id.faults_stat_v);
        scoreView.setText(String.valueOf(faults));
    }

    /**
     * Displays the given score for Visitor.
     */
    public void displayShotVisitor(int shots) {
        TextView scoreView = (TextView) findViewById(R.id.shots_stat_v);
        scoreView.setText(String.valueOf(shots));
    }


}

