package com.iak.saifulka.quizzy;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz1Activity extends AppCompatActivity {

    Button submit1;
    int nilai = 0;


    public  void nilai(View view){
        nilai = nilai + 20;
        nilaiakhir(nilai);
    }
    public void salah(View view){
        nilai = nilai + 0;
        nilaiakhir(nilai);
    }

    public void nilaiakhir(int score){
        TextView skor1 = (TextView)findViewById(R.id.skor);
        skor1.setText(""+score)
        ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quis1);

        final String username1 = getIntent().getStringExtra("username");
        TextView user = (TextView) findViewById(R.id.username1);
        user.setText(username1);

        final TextView skor1 = (TextView)findViewById(R.id.skor);
        final String s = skor1.getText().toString();

        submit1 = (Button) findViewById(R.id.submit1);
        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = username1;
                String sa = s;

                Intent intent = new Intent(Quiz1Activity.this, ScoreActivity.class)
                        .putExtra("username", message)
                        .putExtra("s", skor1.getText().toString());
                startActivity(intent);
            }
        });

    }

}
