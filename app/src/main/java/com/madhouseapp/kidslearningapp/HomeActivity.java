package com.madhouseapp.kidslearningapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.madhouseapp.kidslearningapp.Utils.MessageUtil;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class HomeActivity extends AppCompatActivity {


    private Button start_button;
    private Button about_us_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting up the activity for full screen mode
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_home);

        Toast.makeText(getApplicationContext(), MessageUtil.MESSAGE_HOME_TO_START, Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), MessageUtil.MESSAGE_HOME_OR, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), MessageUtil.MESSAGE_HOME_TO_ABOUT_US, Toast.LENGTH_LONG).show();

        start_button = (Button) findViewById(R.id.start_button);
        about_us_button = (Button) findViewById(R.id.about_us_button);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LandingActivity.class));
            }
        });

        about_us_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LandingActivity.class));
            }
        });
    }
}
