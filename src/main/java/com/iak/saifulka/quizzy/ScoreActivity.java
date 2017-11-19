package com.iak.saifulka.quizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    TextView user, skor;
    Button explanation;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        String username2 = getIntent().getStringExtra("username");
        TextView user = (TextView)findViewById(R.id.username2);
        user.setText(username2);

        String sa = getIntent().getStringExtra("s");
        TextView akhir = (TextView)findViewById(R.id.skorakhir);
        akhir.setText(sa);

        explanation = (Button) findViewById(R.id.explanation);
        explanation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this, ExplanationActivity.class);
                startActivity(intent);
            }
        });

        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }



}
