package com.example.kaneki.myjame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final ImageView imgv = (ImageView) findViewById(R.id.imageView);
        imgv.setImageResource(R.drawable.p3);
        imgv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent imgv = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(imgv);
            }
        });
    }
}
