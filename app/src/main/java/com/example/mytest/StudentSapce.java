package com.example.mytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentSapce extends AppCompatActivity implements View.OnClickListener {
private Button imageButton1,imageButton2;
    private TextView loginName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_student_sapce );
        loginName =findViewById ( R.id.name );
       imageButton1 = findViewById (R.id .p1 );
        imageButton2 = findViewById (R.id .p2 );
        imageButton1.setOnClickListener ( this );
       imageButton2.setOnClickListener ( this );
        getLoginName();

    }

    private void getLoginName() {
        Intent intent = getIntent ();
        if(intent != null) {
            String name = intent.getStringExtra ( "username" );
           loginName.setText ( name );

        }

    }


    @Override
    public void onClick(View v) {
       switch (v.getId ()){
           case R.id.p1:
               Intent intent = new Intent ( StudentSapce.this,SubjectActivity.class );
               startActivity ( intent );
           break;
           case  R.id.p2:

               break;
       }

    }
}
