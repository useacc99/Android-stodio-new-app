package com.example.yournumberid_yourname_android_midterm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MetrixActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnCon, btnRet;
    EditText edtx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metrix);
        initialy();
    }
    private void initialy(){
        btnCon = findViewById(R.id.buttonConvertion);
        btnRet = findViewById(R.id.buttonreturn);
        btnCon.setOnClickListener(this);
        btnRet.setOnClickListener(this);
        edtx = findViewById(R.id.editTextKilometr);

    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonConvertion:
            {
                int numb = Integer.parseInt(edtx.getText().toString());
              int met = numb * 1000;
                Toast.makeText(this, String.valueOf(met), Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.buttonreturn:
            {
                finish();
                break;
            }
        }

    }
}
