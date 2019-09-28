package com.swearRoulette.volhacksiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hom_page);
    }

    public void newGame(View v){
        Intent myIntent = new Intent(getBaseContext(), findFriend.class);
        startActivity(myIntent);
    }
}
