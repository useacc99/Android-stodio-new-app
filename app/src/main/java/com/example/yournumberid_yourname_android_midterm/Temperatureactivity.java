package com.example.yournumberid_yourname_android_midterm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Temperatureactivity extends AppCompatActivity implements View.OnClickListener {
    Button btnconv, btnretur;
    EditText editcel1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temper);
        initial();
    }
    private void initial(){
        btnconv = findViewById(R.id.buttonConvertion);
        btnretur = findViewById(R.id.buttonreturn);
        btnconv.setOnClickListener(this);
        btnretur.setOnClickListener(this);
        editcel1 = findViewById(R.id.editTextTextCelic);

    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonConvertion:{
                int num = Integer.parseInt(editcel1.getText().toString());
                double far = ((num*1.8)+32);
                String res = "result is"+far;

                Toast.makeText(this,String.valueOf(far),Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.buttonreturn:{
                finish();
                 break;
            }
        }

    }

}

