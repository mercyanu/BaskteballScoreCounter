package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    int totalScoreA = 0;
    int totalScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //for team A
    public void threePointA(View view){
        totalScoreA += 3;
        displayA(totalScoreA);
    }
    public void twoPointA(View view){
        totalScoreA += 2;
        displayA(totalScoreA);
    }
    public void onePointA(View view){
        totalScoreA += 1;
        displayA(totalScoreA);
    }

    //for team B
    public void threePointB(View view){
        totalScoreB += 3;
        displayB(totalScoreB);
    }
    public void twoPointB(View view){
        totalScoreB += 2;
        displayB(totalScoreB);
    }
    public void onePointB(View view){
        totalScoreB += 1;
        displayB(totalScoreB);
    }

    private void displayA(int number){
        TextView scoreView = (TextView)findViewById(R.id.teamAscore);
        scoreView.setText("" + number);
    }

    private void displayB(int number){
        TextView scoreView = (TextView)findViewById(R.id.teamBscore);
        scoreView.setText("" + number);
    }

    public void resetScore(View c){
        totalScoreA = 0;
        totalScoreB = 0;

        displayA(totalScoreA);
        displayB(totalScoreB);
    }
}
