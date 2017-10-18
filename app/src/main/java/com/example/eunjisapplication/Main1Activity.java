package com.example.eunjisapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Main1Activity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Log.i("Debug", "Hello this is first. And onCreate");

//        Button button1 = (Button) findViewById(R.id.button1);
//        button1.setOnClickListener(new View.OnClickListener()
//        {
//            public void onClick(View v)
//            {
//                Intent intent = new Intent(Intent.ACTION_VIEW,
//                        Uri.parse("http://www.hywoman.ac.kr"));
//                startActivity(intent);
//            }
//
//
//        });
    }

    //    1번 엑티비티에서 2번 버튼을 누르면 2번 엑티비티로 가게 한다.
//            => // 2번 누르면 2번 액티비티로 갈 수 있게 하는 메소드 작성
    public void move1(View v){
        Intent i = new Intent(this, Main1Activity.class);
        startActivity(i);
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.hywoman.ac.kr"));
        startActivity(intent);
    }

    public void move2(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
//        ViewGroup vg = (ViewGroup) findViewById(R.id.lay2);
//        Scene s = Scene.getSceneForLayout(vg, R.layout.activity_main2, this);
//        s.enter();
    }

    public void move3(View v) {
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
//        ViewGroup vg = (ViewGroup) findViewById(R.id.lay3);
//        Scene s = Scene.getSceneForLayout(vg, R.layout.activity_main3, this);
//        s.enter();
    }
}
