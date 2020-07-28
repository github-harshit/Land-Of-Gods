package com.example.landofgods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hillTextView = findViewById(R.id.hillstation);
        hillTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent=new Intent(MainActivity.this,HillStations.class);
                startActivity(newIntent);
            }
        });
        TextView trekTextView=findViewById(R.id.trek);
        trekTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent newIntent=new Intent(MainActivity.this,TrekAndAdventure.class);
                    startActivity(newIntent);
            }
        });
        TextView pilgrimageTextView=findViewById(R.id.pilgrimages);
        pilgrimageTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent=new Intent(MainActivity.this,Pilgrimages.class);
                startActivity(newIntent);
            }
        });


        TextView cusineTextView=findViewById(R.id.cusine);
        cusineTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent=new Intent(MainActivity.this,TopCusine.class);
                startActivity(newIntent);
            }
        });
        TextView aboutTexView =findViewById(R.id.about);
        aboutTexView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent=new Intent(MainActivity.this,About.class);
                startActivity(newIntent);

            }
        });
    }
}

