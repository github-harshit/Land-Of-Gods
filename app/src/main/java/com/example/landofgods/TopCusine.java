package com.example.landofgods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TopCusine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_cusine);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new TopCusineFragment())
                .commit();

    }

}
