package com.example.petlist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PetListActivity extends AppCompatActivity {

    Context context = this;
    TextView petCat1, petCat2, petDog, textViewPet;
    LinearLayout interLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_list);


        petCat1 = findViewById(R.id.cat1);
        petCat2 = findViewById(R.id.cat2);
        petDog = findViewById(R.id.dog1);
        textViewPet = findViewById(R.id.textvew_list);
    }

    /*<!--<TextView-->
        <!--android:id="@+id/textvew_list"-->
        <!--android:layout_width="wrap_content"-->
        <!--android:layout_height="wrap_content"-->
        <!--android:layout_marginStart="8dp"-->
        <!--android:layout_marginLeft="8dp"-->
        <!--android:layout_marginEnd="8dp"-->
        <!--android:layout_marginRight="8dp"-->
        <!--android:text="@string/_4_test"-->
        <!--android:textSize="30sp"-->
        <!--app:layout_constraintEnd_toEndOf="parent"-->
        <!--app:layout_constraintHorizontal_bias="0.0"-->
        <!--app:layout_constraintStart_toStartOf="parent"-->
        <!--tools:layout_editor_absoluteY="256dp" />-->*/

    void generatePetTextView(String text){
        TextView textView = new TextView(context);

        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setText(text);
        textView.setTextSize(30);
        textView.setPadding(15,15,15,15);
        interLayout.addView(textView);
    }



}

