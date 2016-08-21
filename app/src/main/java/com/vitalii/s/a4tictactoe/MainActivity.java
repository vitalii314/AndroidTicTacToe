package com.vitalii.s.a4tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import playground.SimplePlayGround;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


        public void onStartAgainstPlayerClick(View view) {
            Intent intent = new Intent(MainActivity.this, AgainstPlayerActivity.class);
            startActivity(intent);

        }

    public void onButtonStartAgainstCpuClick(View view) {
        Intent intent = new Intent(MainActivity.this, AgainstCpuActivity.class);
        startActivity(intent);
    }


}
