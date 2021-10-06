package com.example.backtobasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void ToastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show(); //displays message
    }

    public void onClick(View view) {
        EditText num1TxtBox = findViewById(R.id.editTextNum1);
        EditText num2TxtBox = findViewById(R.id.editTextNum2);
        EditText operatorBox = findViewById(R.id.editTextOperation);

        TextView answer = findViewById(R.id.calculate);

        String num1String = num1TxtBox.getText().toString();
        int intNum1 = Integer.parseInt(String.valueOf(num1String));

        String operator = operatorBox.getText().toString();
        String num2String = num2TxtBox.getText().toString();
        int intNum2 = Integer.parseInt(String.valueOf(num2String));

        int answerNumber = 0;

        if (operator.equals('+')){
            answerNumber = intNum1 + intNum2;
        }

        else if(operator.equals('-')){
            answerNumber = intNum1 - intNum2;
        }
        else if(operator.equals('*')){
            answerNumber = intNum1 * intNum2;
        }
        else if(operator.equals('/')){
            answerNumber = intNum1 / intNum2;
        }
        else {
            ToastMsg("THAT'S NOT AN INTEGER!");
        }
        answer.setText(Integer.toString(answerNumber));
    }

}