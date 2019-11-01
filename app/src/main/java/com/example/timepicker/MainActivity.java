package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowTimeClock = (Button) findViewById(R.id.btnShowTimeClock);
        Button btnShowTimeSpinner = (Button) findViewById(R.id.btnShowTimeSpinner);

        btnShowTimeClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent timeClockIntent = new Intent(MainActivity.this,TimeClockActivity.class);
                startActivity(timeClockIntent);
            }
        });

        btnShowTimeSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent timeSpinnerIntent = new Intent(MainActivity.this,TimeSpinnerActivity.class);
                startActivity(timeSpinnerIntent);
            }
        });
    }
}
