package com.example.backtobasics;
//importing packages
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show(); //shows toast
    }

    public void onClick(View view) {

        EditText editPassword = findViewById(R.id.editTextPassword);
        TextView textPassword = findViewById(R.id.textViewPassword);
        String content = editPassword.getText().toString();

        if(content.equals("password")){ //checks if password is correct
            startActivity(new Intent(MainActivity.this,SecondActivity.class)); //Sends to SecondActivity
        }else{
        toastMsg("Wrong Password! C'mon Man");
        }
    }
}