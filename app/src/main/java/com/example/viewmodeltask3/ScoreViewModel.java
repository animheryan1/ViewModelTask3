package com.example.viewmodeltask3;

import androidx.lifecycle.ViewModel;

class ScoreViewModel extends ViewModel {
    private int scoreTeamA =0;
    private int scoreTeamB =0;


    int getScoreTeamA() {
        return scoreTeamA;
    }

    void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    int getScoreTeamB() {
        return scoreTeamB;
    }

    void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }
}
