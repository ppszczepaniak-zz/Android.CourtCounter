package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Reset
    public void resetScore(View widok) {
        resetuj();
    }

    private void resetuj() {
        scoreA = 0;
        scoreB = 0;
        pokazA(scoreA);
        pokazB(scoreB);
    }

    //Druyżyna B

    /**
     * ten wariant jest lepszy! (kod jest krótszy)
     */
    public void plusThreeB(View view) {
        scoreB = scoreB + 3;
        pokazB(scoreB);
    }

    public void plusTwoB(View view) {
        scoreB = scoreB + 2;
        pokazB(scoreB);
    }

    public void plusOneB(View view) {
        scoreB = scoreB + 1;
        pokazB(scoreB);
    }

    private void pokazB(int points) {
        TextView punktyB = (TextView) findViewById(R.id.id_scoreB);
        punktyB.setText(Integer.toString(scoreB));
    }


    //Drużyna A
    public void plusThreeA(View view) {
        pokazA(3);
    }

    public void plusTwoA(View view) {
        pokazA(2);
    }

    public void plusOneA(View view) {
        pokazA(1);
    }

    private void pokazA(int points) {
        TextView punktyA = (TextView) findViewById(R.id.id_scoreA);
        switch (points) {
            case 1:
                scoreA = scoreA + 1;
                punktyA.setText(Integer.toString(scoreA));
                break;
            case 2:
                scoreA = scoreA + 2;
                punktyA.setText(Integer.toString(scoreA));
                break;
            case 3:
                scoreA = scoreA + 3;
                punktyA.setText(Integer.toString(scoreA));
                break;
            case 0:
                punktyA.setText(Integer.toString(scoreA));
                break;
        }
    }
}
