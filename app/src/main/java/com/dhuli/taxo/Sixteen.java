package com.dhuli.taxo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Sixteen extends AppCompatActivity {

    ImageView profile1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteen);
     profile1 = findViewById(R.id.profile1);

     profile1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(Sixteen.this,Seventeen.class);
             startActivity(intent);
         }
     });

    }
}