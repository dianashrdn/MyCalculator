package com.example.mycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView fnlResult;
    EditText expr1, expr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expr1 = (EditText) findViewById(R.id.expr1);
        expr2 = (EditText) findViewById(R.id.expr2);

    }

    public void sendtoCalculate(View vw ){
        Intent intent = new Intent(this, Calculate.class);
        intent.putExtra("expr1", expr1.getText().toString());
        intent.putExtra("expr2", expr2.getText().toString());

       startActivityForResult(intent, 0);
    }

    protected  void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode, data);

        int finalResult = Integer.parseInt(data.getStringExtra("result"))*20;
        fnlResult = (TextView) findViewById(R.id. fnlResult);
        fnlResult.setText(String.valueOf(finalResult));
    }

}
