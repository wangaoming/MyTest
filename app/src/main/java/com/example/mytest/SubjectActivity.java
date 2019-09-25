package com.example.mytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SubjectActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
private  String[] text={"移动应用开发","大学英语","高等数学"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_subject );
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //给左上角添加返回箭头
        getSupportActionBar().setTitle("课程管理");
        listView = findViewById ( R.id.list );
        ArrayAdapter<String> adapter = new ArrayAdapter <String> (SubjectActivity.this, android.R.layout.simple_list_item_1, text);
listView.setAdapter ( adapter );
listView.setOnItemClickListener ( this );

    }

    @Override
    public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
        switch(position){
            case 0: Intent intent = new Intent (  view.getContext (),LessonActivity.class);
                startActivity ( intent );
                break;

            case 1:
                Intent intent1 = new Intent (  view.getContext (),LessonActivity.class);
                startActivity ( intent1 );
                break;
            case 2: Intent intent2 = new Intent (  view.getContext (),LessonActivity.class);
                startActivity ( intent2 );
                break;
        }

    }
}
