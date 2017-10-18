package com.example.eunjisapplication;

/**
 * Created by 곽은지 on 2017-10-18.
 */

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

public class FragmentExampleActivity extends FragmentActivity
        implements ToolbarFragment.ToolbarListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_example);
    }

    public void onButtonClick(int fontsize, String text) {
        TextFragment textFragment =
                (TextFragment)
                        getSupportFragmentManager().findFragmentById(R.id.text_fragment);
        textFragment.changeTextProperties(fontsize, text);
    }
}
