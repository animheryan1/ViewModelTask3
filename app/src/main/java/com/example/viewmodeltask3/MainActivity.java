package com.example.viewmodeltask3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ScoreViewModel scoreViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        displayScore(R.id.team_a_score, scoreViewModel.getScoreTeamA());
        displayScore(R.id.team_b_score, scoreViewModel.getScoreTeamB());
    }

    private void displayScore(int teamID, int score) {
        TextView scoreView = findViewById(teamID);
        scoreView.setText(String.valueOf(score));
    }

    public void addPoint(View view) {
        if (view.getTag().toString().equals("teamA")) {
            scoreViewModel.setScoreTeamA(scoreViewModel.getScoreTeamA() + 1);
            displayScore(R.id.team_a_score, scoreViewModel.getScoreTeamA());
        } else {
            scoreViewModel.setScoreTeamB(scoreViewModel.getScoreTeamB() + 1);
            displayScore(R.id.team_b_score, scoreViewModel.getScoreTeamB());
        }
    }

    public void subPoint(View view) {
        if (view.getTag().toString().equals("teamA")) {
            scoreViewModel.setScoreTeamA(scoreViewModel.getScoreTeamA() - 1);
            displayScore(R.id.team_a_score, scoreViewModel.getScoreTeamA());
        } else {
            scoreViewModel.setScoreTeamB(scoreViewModel.getScoreTeamB() - 1);
            displayScore(R.id.team_b_score, scoreViewModel.getScoreTeamB());
        }
    }

    public void resetScore(View view) {
        scoreViewModel.setScoreTeamB(0);
        scoreViewModel.setScoreTeamA(0);
        displayScore(R.id.team_a_score, scoreViewModel.getScoreTeamA());
        displayScore(R.id.team_b_score, scoreViewModel.getScoreTeamB());
    }
}
