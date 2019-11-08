package com.example.appclass_hw08_bmiwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textResult;
    TextView textBMI;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textResult = findViewById(R.id.textResult);
        textBMI = findViewById(R.id.textBMI);

        intent = getIntent();
        textResult.setText(intent.getStringExtra("Result"));
        float bmi = intent.getFloatExtra("BMI",1);
        textBMI.setText("您的BMI為: " + bmi);

    }
    public void BtnBackOnclick(View view){
        finish();
    }
}
