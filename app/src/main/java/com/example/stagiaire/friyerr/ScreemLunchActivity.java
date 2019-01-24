package com.example.stagiaire.friyerr;

import android.app.Application;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ScreemLunchActivity extends AppCompatActivity {

     private static final String TAG = "X:";

    @Override
    public void onCreate(Bundle savedInstanceState , PersistableBundle persistentState) {
        super.onCreate(savedInstanceState ,persistentState);

    }

    @Override
    public void onResume(){
        super.onResume();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                StartupApps();
            }
        };
        Thread startupWork = new Thread(runnable);
        startupWork.start();

    }

    public void StartupApps()
    {
        try{
         Thread.sleep(2000); // Simulate a bit of startup work.
        } catch(InterruptedException e){
             e.printStackTrace();
         }

        if (true)
        {
            startActivity(new Intent(this, FriyerrLoginActivity.class));
        }
        else
        {
            startActivity(new Intent(this, MapsActivity.class));
        }

    }
}
