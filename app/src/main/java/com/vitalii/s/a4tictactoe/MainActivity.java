package com.vitalii.s.a4tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import playground.Playground;
import playground.SimplePlayGround;
import playground.State;

public class MainActivity extends Activity {


    Button mButtonStartPlayer;
    TextView mResultText;
    SimplePlayGround simplePlayground = new SimplePlayGround();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


        public void onStartAgainstPlayerClick(View view) {
            Intent intent = new Intent(MainActivity.this, AgainstPlayerActivity.class);
            startActivity(intent);

        }



}
