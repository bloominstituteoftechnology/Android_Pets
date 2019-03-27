package com.example.petlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView petCat1, petCat2, petDog, textViewPet;
    LinearLayout interLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        petCat1 = findViewById(R.id.cat1);
        petCat2 = findViewById(R.id.cat2);
        petDog = findViewById(R.id.dog1);
    }

}


