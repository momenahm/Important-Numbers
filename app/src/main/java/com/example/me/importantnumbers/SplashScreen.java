package com.example.me.importantnumbers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {
ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
          progressBar = (ProgressBar)findViewById(R.id.progress);

        new Thread(new Runnable() {
            @Override
            public void run() {
                upwork();
                startApp();
            }
        }).start();

    }

    private void upwork()
    {
        for (int i = 0 ; i <=100 ; i+=10)
        {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void startApp() {
        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
    }

}
