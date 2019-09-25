package com.example.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_lesson );
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //给左上角添加返回箭头
        getSupportActionBar().setTitle("课程详情介绍");
    }
}
