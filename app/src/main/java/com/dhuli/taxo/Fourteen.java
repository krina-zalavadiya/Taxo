package com.dhuli.taxo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.nio.file.FileVisitOption;

public class Fourteen extends AppCompatActivity {


    CardView done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen);

     done = findViewById(R.id.done);

     done.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(Fourteen.this,Fifteen.class);
             startActivity(intent);
         }
     });

    }
}