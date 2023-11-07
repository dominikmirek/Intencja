package com.example.intencja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    Button button;
    TextView pole, ob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button2);
        pole = findViewById(R.id.pole);
        ob = findViewById(R.id.ob);

        Intent i = getIntent();

       double p = i.getExtras().getDouble("pole");
       double b = i.getExtras().getDouble("ob");

       pole.setText(String.valueOf(p));
       ob.setText(String.valueOf(b));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });


    }
}