package com.dhuli.taxo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.net.Inet4Address;

public class Fourth extends AppCompatActivity {

    ImageView back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

       back1 = findViewById(R.id.back1);

       back1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent =  new Intent(Fourth.this,Fifth.class);
               startActivity(intent);
           }
       });
    }


}