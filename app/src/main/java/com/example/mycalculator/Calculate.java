package com.example.mycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Calculate extends AppCompatActivity {
    TextView firstResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        Intent intent = getIntent();

        int firstNum, secondNum;
        firstNum = Integer.parseInt(intent.getStringExtra("expr1"));
        secondNum = Integer.parseInt(intent.getStringExtra("expr2"));


        int result = firstNum + secondNum;

        firstResult = (TextView) findViewById(R.id.firstResult);
        firstResult.setText(String.valueOf(result));
        Intent intent2 = new Intent();
        intent2.putExtra("result",String.valueOf(result));
        setResult(RESULT_OK,intent2);
    }
}
