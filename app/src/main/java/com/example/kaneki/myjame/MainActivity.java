package com.example.kaneki.myjame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imgv = (ImageView) findViewById(R.id.imageView2);
        imgv.setImageResource(R.drawable.p2);
        imgv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent imgv = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(imgv);
            }
        });
    }
}


