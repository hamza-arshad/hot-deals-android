package com.hotdeals.hotdeals.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.hotdeals.hotdeals.R;

public class SplashActivity extends AppCompatActivity {

    private static final long SLEEP_TIME = 1; //5;
    private static final String TAG = SplashActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        IntentLauncher intentLauncher = new IntentLauncher();
        intentLauncher.start();
    }

    private class IntentLauncher extends Thread
    {
        @Override
        public void run()
        {
            try
            {
                Thread.sleep(SLEEP_TIME*1000);
            }
            catch(Exception e)
            {
                Log.e(TAG, e.toString());
            }

            Intent intent = new Intent(SplashActivity.this, DealDetailActivity.class);
            SplashActivity.this.startActivity(intent);
            SplashActivity.this.finish();


        }
    }

}
