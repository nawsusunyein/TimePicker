package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimeClockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_clock);

        final TimePicker timePickerClock = (TimePicker) findViewById(R.id.timePicker);
        Button btnShowTimeClock = (Button) findViewById(R.id.btnShowTime);
        final TextView txtShowTimeView = (TextView) findViewById(R.id.txtSelectedTime);

        btnShowTimeClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour,minute;
                String am_pm;

                if(Build.VERSION.SDK_INT >= 23){
                    hour = timePickerClock.getHour();
                    minute = timePickerClock.getMinute();
                }else{
                    hour = timePickerClock.getCurrentHour();
                    minute = timePickerClock.getCurrentMinute();
                }

                if(hour > 12){
                    am_pm = "PM";
                    hour = hour - 12;

                }else{
                    am_pm = "AM";
                }

                String selectedTime = hour + ":" + minute + am_pm;
                txtShowTimeView.setText(selectedTime);
            }
        });

    }
}
