package com.example.stagiaire.friyerr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FriyerrForgotPasswordActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        final Button BtnCancel = (Button) findViewById(R.id.BtnInForgotPasswordForCancel);

        BtnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Finish();
            }
        });
    }

    public void Finish(){
        this.finish();
    }
}
