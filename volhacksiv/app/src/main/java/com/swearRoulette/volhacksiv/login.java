package com.swearRoulette.volhacksiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.nio.charset.Charset;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText ET = (EditText) findViewById(R.id.getPhone);
        Button B1 = (Button) findViewById(R.id.joinORlogin);
        B1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                ET.setVisibility(View.INVISIBLE);
                Long phonenum = Long.parseLong(ET.getText().toString());
                if((ET.getText().length() < 10) || (ET.getText().length() > 10))
                {
                    Context con = getApplicationContext();
                    CharSequence error = "Please enter your phone number in 9993330000 form.";
                    int duration = Toast.LENGTH_SHORT;
                    Toast err = Toast.makeText(con, error, duration);
                    err.show();
                } else {
                    Context con = getApplicationContext();
                    CharSequence ent = "Saving Number "+ET.getText();
                    int duration = Toast.LENGTH_SHORT;
                    Toast enter = Toast.makeText(con, ent, duration);
                    enter.show();
                    Intent myIntent = new Intent(getBaseContext(), homPage.class);
                    startActivity(myIntent);
                }
                ET.setVisibility(View.VISIBLE);
            } });
    }
    // Write a message to the database

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");



    public void getPhoneNumber(View v){

    }
}
