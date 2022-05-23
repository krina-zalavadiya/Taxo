package com.dhuli.taxo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Eleven extends AppCompatActivity {


    CardView enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);

      enter = findViewById(R.id.enter);

      enter.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(Eleven.this,Twelve.class);
              startActivity(intent);
          }
      });
    }
}