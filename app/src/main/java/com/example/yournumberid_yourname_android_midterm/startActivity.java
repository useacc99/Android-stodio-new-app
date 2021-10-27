package com.example.yournumberid_yourname_android_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class startActivity extends AppCompatActivity implements View.OnClickListener{
Button btnend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        done();
    }
    private void done(){
        btnend=findViewById(R.id.buttonend);
        btnend.setOnClickListener(this);
    }
    public void onClick(View view){
        finish();
    }
    public  void infotemp(View view){
        Intent intent = new Intent(this, Temperatureactivity.class);
        startActivity(intent);
    }
    public  void infometr(View view){
        Intent intent = new Intent(this, MetrixActivity.class);
        startActivity(intent);
    }
    public  void endprog(View view){
        Intent intent = new Intent(this, startActivity.class);
        startActivity(intent);
    }

}