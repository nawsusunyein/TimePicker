package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimeSpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_spinner);
        final TimePicker timePickerSpinner = (TimePicker) findViewById(R.id.timePickerSpinner);
        Button btnShowTime = (Button) findViewById(R.id.btnShowSpinnerTime);
        final TextView txtSelectedTime = (TextView) findViewById(R.id.txtSelectedSpinnerTime);

        btnShowTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour,minute;
                String am_pm;

                if(Build.VERSION.SDK_INT >= 23){
                    hour = timePickerSpinner.getHour();
                    minute = timePickerSpinner.getMinute();
                }else{
                    hour = timePickerSpinner.getCurrentHour();
                    minute = timePickerSpinner.getCurrentMinute();
                }

                if(hour > 12){
                    am_pm = "PM";
                    hour = hour - 12;
                }else {
                    am_pm = "AM";
                }

                String selectedTime = hour + ":" + minute + am_pm;
                txtSelectedTime.setText(selectedTime);
            }
        });
    }
}
