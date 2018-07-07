package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int A=0,B=0;
    public void score(View view)
    {
        switch(view.getId())
        {
            case R.id.teamA3:
                // Code for button 1 click
                A+=3;
                displayA();
                break;

            case R.id.teamA2:
                A+=2; displayA();// Code for button 2 click
                break;

            case R.id.teamAf:
               A+=1; displayA(); // Code for button 3 click
                break;
            case R.id.teamB3:
                // Code for button 1 click
                B+=3;
                displayB();
                break;

            case R.id.teamB2:
                B+=2; displayB();// Code for button 2 click
                break;

            case R.id.teamBf:
                B+=1; displayB(); // Code for button 3 click
                break;
            case R.id.reset:
                A=0;B=0;
                displayA();displayB();break;
        }

    }
    public void displayA()
    {
        TextView scoreTextView = (TextView) findViewById(R.id.teamA);
        scoreTextView.setText(""+A);
    }
    public void displayB()
    {
        TextView scoreTextView = (TextView) findViewById(R.id.teamB);
        scoreTextView.setText(""+B);
    }

}
