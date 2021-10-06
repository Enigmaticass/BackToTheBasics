package com.example.backtobasics;
//importing packages
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();

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
    public void onClick2(View view){
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Goodbye World! See You Tomorrow!");
    }
}