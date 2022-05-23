package com.dhuli.taxo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Seven extends AppCompatActivity {

    CardView verifynow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);

         verifynow = findViewById(R.id.verifynow);

         verifynow.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(Seven.this,Eight.class);
                 startActivity(intent);
             }
         });
    }
}