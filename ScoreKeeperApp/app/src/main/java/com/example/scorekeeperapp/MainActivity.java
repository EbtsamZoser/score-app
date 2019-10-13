package com.example.scorekeeperapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    int team_a_score = 0;
    int team_b_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

         // reset button
        public void resetScores(View v) {
        team_a_score = 0;
        team_b_score = 0;
        displayTeamAScore(team_a_score);
        displayTeamBScore(team_b_score);
    }
     //calculate the score
    public void updateTeamScore(View v) {
        switch(v.getId()) {
            case R.id.team_a_touchdown:
                team_a_score += 6;
                break;
            case R.id.team_a_field_goal:
                team_a_score += 3;
                break;
            case R.id.team_a_extra_point_1:
                team_a_score += 1;
                break;
            case R.id.team_a_extra_point_2:
                team_a_score += 2;
                break;
            case R.id.team_a_safety:
                team_a_score += 2;
                break;

            case R.id.team_b_touchdown:
                team_b_score += 6;
                break;
            case R.id.team_b_field_goal:
                team_b_score += 3;
                break;
            case R.id.team_b_extra_point_1:
                team_b_score += 1;
                break;
            case R.id.team_b_extra_point_2:
                team_b_score += 2;
                break;
            case R.id.team_b_safety:
                team_b_score += 2;
                break;

            default:
                break;
        }

        displayTeamAScore(team_a_score);
        displayTeamBScore(team_b_score);
    }

         // Display Scores methods
    private void displayTeamAScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void displayTeamBScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}