package com.swearRoulette.volhacksiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class findFriend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_friend);
        final EditText ET = (EditText) findViewById(R.id.getPhone);
        Button B1 = (Button) findViewById(R.id.findfriend);
        B1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                boolean find = true;
                ET.setVisibility(View.INVISIBLE);
                Long phonenum = Long.parseLong(ET.getText().toString());
                if ((ET.getText().length() < 10) || (ET.getText().length() > 10)) {
                    Context con = getApplicationContext();
                    CharSequence error = "Please enter your phone number in 9993330000 form.";
                    int duration = Toast.LENGTH_SHORT;
                    Toast err = Toast.makeText(con, error, duration);
                    err.show();
                } else if (!find){}else {
                    Context con = getApplicationContext();
                    CharSequence ent = "Saving Number " + ET.getText();
                    int duration = Toast.LENGTH_SHORT;
                    Toast enter = Toast.makeText(con, ent, duration);
                    enter.show();
                    Intent myIntent = new Intent(getBaseContext(), homPage.class);
                    startActivity(myIntent);
                }
                ET.setVisibility(View.VISIBLE);
            }
        });
    }
}
