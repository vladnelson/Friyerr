package com.example.stagiaire.friyerr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FriyerrLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final TextView txtBtnRegister = (TextView) findViewById(R.id.txtInLoginForVRegister);
        final TextView txtBtnForgotPassword = (TextView) findViewById(R.id.txtVInLoginForForgotPassword);
        final Button BtnLogin = (Button) findViewById(R.id.BtnInLoginForLogin);

        txtBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAnActivity(v,FriyerrRegisterActivity.class);
            }
        });
        txtBtnForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAnActivity(v,FriyerrForgotPasswordActivity.class);
            }
        });
        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Thread.sleep(2000); // Simulate a bit of startup work.
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

    }

    public void goToAnActivity(View view, Class C) {
        Intent intent = new Intent(this,C );
        startActivity(intent);
    }
}