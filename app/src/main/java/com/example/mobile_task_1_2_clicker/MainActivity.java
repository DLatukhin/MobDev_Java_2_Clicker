package com.example.mobile_task_1_2_clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    TextView tvScore;
    ImageButton mainBtn;
    Button btnDecrease;
    Button btnDrop;

    private long score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText =  findViewById(R.id.mainText);
        tvScore = findViewById(R.id.tvScore);
        mainBtn = findViewById(R.id.button);
        btnDecrease = findViewById(R.id.btnDecrement);
        btnDrop = findViewById(R.id.btnDrop);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                tvScore.setText(String.valueOf(score));
            }
        };

        mainBtn.setOnClickListener(clickListener);

        btnDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = score == 0 ? 0 : score-1;
                tvScore.setText(String.valueOf(score));
            }
        });

        btnDrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                tvScore.setText(String.valueOf(score));
            }
        });

    }
}

