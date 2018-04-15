package com.demo.zg.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.demo.zg.demo.R.layout.activity_main;
import static com.demo.zg.demo.R.layout.activity_main2;

/**
 * Created by ZG on 2018/3/31.
 */

public class Main2Activity extends AppCompatActivity {

    private Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main2);
        intiview();
    }
    private void intiview(){
        bt2 = (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

    }
}
