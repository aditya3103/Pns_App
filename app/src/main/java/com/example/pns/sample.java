package com.example.pns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sample extends AppCompatActivity {
    TextView textView = (TextView)findViewById(R.id.textView);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        textView.setText("Bye !");
    }
}