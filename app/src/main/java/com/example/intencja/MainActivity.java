package com.example.intencja;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     EditText ba, bb, bc;

     Button kolo, kwadret, prostokat, trojkat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ba = findViewById(R.id.la);
        bb = findViewById(R.id.lb);
        bc = findViewById(R.id.lc);

        kolo = findViewById(R.id.Kolo);
        kwadret = findViewById(R.id.kwadrat);
        prostokat = findViewById(R.id.Prostokat);
        trojkat = findViewById(R.id.trojkat);
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

        kwadret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a;
                try {
                     a = Integer.parseInt(ba.getText().toString());
                }catch (NumberFormatException ex){
                    Toast.makeText(MainActivity.this, "Podaj Liczby", Toast.LENGTH_LONG).show();
                    return;}
               double pole = a*a;
               double ob = 4*a;
                intent.putExtra("pole", pole);
                intent.putExtra("ob", ob);
                startActivity(intent);
            }
        });
        kolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a;
                try {
                    a = Integer.parseInt(ba.getText().toString());
                }catch (NumberFormatException ex){return;}
                double pole = 3.14 *a*a;
                double ob = 2*3.14*a;
                intent.putExtra("pole", pole);
                intent.putExtra("ob", ob);
                startActivity(intent);
            }
        });
        prostokat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b;
                try {
                    a = Integer.parseInt(ba.getText().toString());
                    b = Integer.parseInt(bb.getText().toString());
                }catch (NumberFormatException ex){return;}
                double pole = b*a;
                double ob = 2*a+2*b;
                intent.putExtra("pole", pole);
                intent.putExtra("ob", ob);
                startActivity(intent);
            }
        });
        trojkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c;
                try {
                    a = Integer.parseInt(ba.getText().toString());
                    b = Integer.parseInt(bb.getText().toString());
                    c = Integer.parseInt(bc.getText().toString());
                }catch (NumberFormatException ex){return;}
                double ob = a+b+c;
                double pole = poleT(a,b,c);
                intent.putExtra("pole", pole);
                intent.putExtra("ob", ob);
                startActivity(intent);
            }
        });

    }
    public double poleT(double a, double b, double c){
        double p, pole,d;
        p = (a+b+c)/2;
        d = p*(p-a)*(p-b)*(p-c);
        pole = Math.sqrt(d);
        return pole;
    }

}