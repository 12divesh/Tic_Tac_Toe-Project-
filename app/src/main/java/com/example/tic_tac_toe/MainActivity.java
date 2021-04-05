package com.example.tic_tac_toe;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPlay = findViewById(R.id.button_message);
        Button buttonExit = findViewById(R.id.button_exit);


    }

    public void play(View view) {
        // Intent we used one activity to another activity

        Intent intent = new Intent(this, BestActivity.class);
        startActivity(intent);

    }
    public void exit(View view){
        finish();
        System.exit(0);
    }

}

