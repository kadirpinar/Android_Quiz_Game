package com.example.braintrainer;

import android.content.Intent;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public   int sayi1;
    public   int sayi2;
    public   int sonuç;
    public   int sonuç1;
    public   int sonuç2;
    public   int sonuç3;
    public   int random;
    public   int random1;
    public   int random2;
    public   int random3;
    public  int a;
    public  int b;
    public  int c;
    public  int d;
    public int count=0;
    public int couuntt=0;
    public int counttt=1;
    public  int soru_sayısı=13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn1 = (Button) findViewById(R.id.button);
        final Button btn2 = (Button) findViewById(R.id.button2);
        final Button btn3 = (Button) findViewById(R.id.button3);
        final Button btn4 = (Button) findViewById(R.id.button4);
        TextView txt = (TextView) findViewById(R.id.textView);
        TextView txt3 = (TextView) findViewById(R.id.textView3);
        TextView txt2 = (TextView) findViewById(R.id.textView2);
        sayi1 = (int) (Math.random() * 100 + 1);
        sayi2 = (int) (Math.random() * 100 + 1);
        random = (int) (Math.random() * 4 + 1);
        random1 = (int) (Math.random() * 10 + 1);
        random2 = (int) (Math.random() * 10 + 1);
        random3 = (int) (Math.random() * 10 + 1);
        sonuç = sayi1 + sayi2;
        txt.setText(sayi1 + "+" + sayi2);
        txt2.setText("      ");

        txt3.setText("          " );
        if (random == 1) {
            btn1.setText("" + sonuç);
            sonuç1 = sonuç - random1;
            btn2.setText("" + sonuç1);
            sonuç2 = sonuç + random2;
            btn3.setText("" + sonuç2);
            sonuç3 = sonuç + random3;
            btn4.setText("" + sonuç3);
        } else if (random == 2) {
            btn2.setText("" + sonuç);
            sonuç1 = sonuç - random1;
            btn1.setText("" + sonuç1);
            sonuç2 = sonuç + random2;
            btn3.setText("" + sonuç2);
            sonuç3 = sonuç + random3;
            btn4.setText("" + sonuç3);
        } else if (random == 3) {
            btn3.setText("" + sonuç);
            sonuç1 = sonuç - random1;
            btn1.setText("" + sonuç1);
            sonuç2 = sonuç + random2;
            btn2.setText("" + sonuç2);
            sonuç3 = sonuç + random3;
            btn4.setText("" + sonuç3);
        } else if (random == 4) {
            btn4.setText("" + sonuç);
            sonuç1 = sonuç - random1;
            btn1.setText("" + sonuç1);
            sonuç2 = sonuç + random2;
            btn2.setText("" + sonuç2);
            sonuç3 = sonuç - random3;
            btn3.setText("" + sonuç3);
        }
        if (soru_sayısı == 0) {
            rapor();
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.valueOf((String) btn1.getText());
                if (a == sonuç) {
                    Toast.makeText(getApplicationContext(), "Bildiniz", Toast.LENGTH_LONG).show();
                    soru_sayısı--;
                    count++;
                    counttt++;
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış", Toast.LENGTH_LONG).show();
                    soru_sayısı--;
                    couuntt++;
                    counttt++;
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = Integer.valueOf((String) btn2.getText());
                if (b == sonuç) {

                    Toast.makeText(getApplicationContext(), "Bildiniz", Toast.LENGTH_LONG).show();
                    soru_sayısı--;
                    count++;
                    counttt++;
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış", Toast.LENGTH_LONG).show();
                    soru_sayısı--;
                    couuntt++;
                    counttt++;
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = Integer.valueOf((String) btn3.getText());
                if (c == sonuç) {
                    Toast.makeText(getApplicationContext(), "Bildiniz", Toast.LENGTH_LONG).show();
                    soru_sayısı--;
                    count++;
                    counttt++;
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış", Toast.LENGTH_LONG).show();
                    soru_sayısı--;
                    couuntt++;
                    counttt++;
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = Integer.valueOf((String) btn4.getText());
                if (d == sonuç) {
                    Toast.makeText(getApplicationContext(), "Bildiniz", Toast.LENGTH_LONG).show();
                    soru_sayısı--;
                    count++;
                    counttt++;
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış", Toast.LENGTH_LONG).show();
                    soru_sayısı--;
                    couuntt++;
                    counttt++;
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);

                }

            }
        });
    }

    private void rapor() {

        TextView txt2 = (TextView) findViewById(R.id.textView2);
        txt2.setText("Doğru sayısı:"+count+"Yanlış Sayısı:"+couuntt);

    }


}