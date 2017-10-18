package com.example.eunjisapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.activity_fragment_example);

        Log.i("Debug", "Hello this is main. And onCreate");
    }

    //    1번 엑티비티에서 2번 버튼을 누르면 2번 엑티비티로 가게 한다.
//            => // 2번 누르면 2번 액티비티로 갈 수 있게 하는 메소드 작성
    public void move(View v){
        Intent i = new Intent(this, Main1Activity.class);
        startActivity(i);
    }

    public void moveCreate1(View v){
        Intent i = new Intent(this, Main6Activity.class);
        startActivity(i);
    }

//    public void moveCreate(View v){
//        Intent myIntent = new Intent(getApplicationContext(), Main5Activity.class);
//        startActivity(myIntent);
//    }

}
