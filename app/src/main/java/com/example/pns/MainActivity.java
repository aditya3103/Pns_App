package com.example.pns;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.MenuInflater;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    //Intent intent = new Intent(this, NormalDistribution.class);





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button = findViewById(R.id.binomial);

    }


    public void gamma(View view){
        Intent intent = new Intent(this, gamma_distr.class);
        startActivity(intent);
    }

    public void normal(View view){
        Intent intent = new Intent(this, NormalDistribution.class);
        startActivity(intent);
    }

    public  void binomial(View view){
        Intent intent = new Intent(this, BinomialDistribution.class);
        startActivity(intent);
    }

    public  void tdistri(View view){
        Intent intent = new Intent(this, tdistri.class);
        startActivity(intent);
    }

    public void chi(View view){
        Intent intent = new Intent(this, ChiDistri.class);
        startActivity(intent);
    }
}