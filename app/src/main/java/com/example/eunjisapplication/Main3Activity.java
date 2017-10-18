package com.example.eunjisapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Log.i("Debug", "Hello this is third.");
    }

    public void move1(View v){
        Intent i = new Intent(this, Main1Activity.class);
        startActivity(i);
    }

    public void move2(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void move3(View v){
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
    }
}
