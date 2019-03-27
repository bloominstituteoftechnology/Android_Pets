package com.example.android_pets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] petList = {"Rollie", "Jazmine", "Bailey", "Rainbow", "Lira", "Fatty"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (String petLoop : petList) {
            ((LinearLayout)findViewById(R.id.listMyPets)).addView(genTextView(petLoop));
        }
    }


    public TextView genTextView (String petLoop){
        TextView view = new TextView(this);
        view.setText(petLoop);
        view.setTextColor(getResources().getColor(R.color.colorPrimary));
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        return view;
    }
}
