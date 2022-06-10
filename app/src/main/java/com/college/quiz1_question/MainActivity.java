package com.college.quiz1_question;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    int mCounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //counterView is the TextView that displays the value of the counter
        TextView counterView = findViewById(R.id.counterId);
        Button counterReset = findViewById(R.id.buttonResetId);
        Button increment = findViewById(R.id.buttonIncId);
        Button decrement = findViewById(R.id.buttonDecId);

        counterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter++;
                TextView counterText = findViewById(R.id.counterId);
                counterText.setText(String.valueOf(mCounter));
                Snackbar snack = Snackbar.make(view, "the counter is now " + mCounter, Snackbar.LENGTH_LONG);
                snack.show();
            }
        });

        counterReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter = 0;
                TextView counterText = findViewById(R.id.counterId);
                counterText.setText(String.valueOf(mCounter));
                Snackbar snack = Snackbar.make(view, "the counter is now " + mCounter, Snackbar.LENGTH_LONG);
                snack.show();
            }
        });

        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter++;
                TextView counterText = findViewById(R.id.counterId);
                counterText.setText(String.valueOf(mCounter));
                Snackbar snack = Snackbar.make(view, "the counter is now " + mCounter, Snackbar.LENGTH_LONG);
                snack.show();
            }
        });

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter--;
                TextView counterText = findViewById(R.id.counterId);
                counterText.setText(String.valueOf(mCounter));
                Snackbar snack = Snackbar.make(view, "the counter is now " + mCounter, Snackbar.LENGTH_LONG);
                snack.show();
            }
        });


    }
}