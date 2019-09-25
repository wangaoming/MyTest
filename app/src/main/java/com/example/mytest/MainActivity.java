package com.example.mytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText userName,passWord;
    private Button studentLogin,reBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        userName = findViewById ( R.id.username );
        passWord = findViewById ( R.id.password );
        studentLogin = findViewById ( R.id.login );
        reBack = findViewById ( R.id.reback );
        studentLogin.setOnClickListener ( this );
        reBack.setOnClickListener ( this );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId ()){
            case R.id.login:
                studentLogin();
                break;
            case R.id.reback:
                finish ();
                break;
        }

    }

    private void studentLogin() {
        String name = userName.getText ().toString ().trim ();
        String  pass = passWord.getText ().toString ().trim ();
        if(name.equals ( "wangaoming" )&&pass.equals ( "0000" )){
            Intent itent  = new  Intent(MainActivity.this,StudentSapce.class);
            itent.putExtra ( "username",name );
            startActivity ( itent );
        }
        else {
            Toast.makeText ( MainActivity.this,"亲，输入的密码和用户名不正确哦！",Toast.LENGTH_LONG ).show ();
        }
    }
}
