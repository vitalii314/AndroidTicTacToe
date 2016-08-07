package com.vitalii.s.a4tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import playground.Playground;
import playground.SimplePlayGround;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    int count=0;
    Button mButton11;
    Button mButton12;
    Button mButton13;
    Button mButton21;
    Button mButton22;
    Button mButton23;
    Button mButton31;
    Button mButton32;
    Button mButton33;
    SimplePlayGround simplePlayground = new SimplePlayGround();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton11 = (Button)findViewById(R.id.button11);
        mButton12 = (Button)findViewById(R.id.button12);
        mButton13 = (Button)findViewById(R.id.button13);
        mButton21 = (Button)findViewById(R.id.button21);
        mButton22 = (Button)findViewById(R.id.button22);
        mButton23 = (Button)findViewById(R.id.button23);
        mButton31 = (Button)findViewById(R.id.button31);
        mButton32 = (Button)findViewById(R.id.button32);
        mButton33 = (Button)findViewById(R.id.button33);

        mButton11.setOnClickListener(this);
        mButton12.setOnClickListener(this);
        mButton13.setOnClickListener(this);
        mButton21.setOnClickListener(this);
        mButton22.setOnClickListener(this);
        mButton23.setOnClickListener(this);
        mButton31.setOnClickListener(this);
        mButton32.setOnClickListener(this);
        mButton33.setOnClickListener(this);

        simplePlayground.start();

    }


//    public void Button11Clicked(View view) {
//        mTextView.setText("Я хожу "+ ++count);
//
//    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button11:
                simplePlayground.doStep(1, 1);
                switch (simplePlayground.getBoard().cells[1][1].content) {
                    case CROSS:
                        mButton11.setText(R.string.cross);
                        break;
                    case NOUGHT:
                        mButton11.setText(R.string.nought);
                        break;
                    case EMPTY:
                        mButton11.setText(R.string.empty);
                        break;
                }
                break;

            case R.id.button12:
                simplePlayground.doStep(1,2);
                switch (simplePlayground.getBoard().cells[1][2].content) {
                    case CROSS:
                        mButton12.setText(R.string.cross);
                        break;
                    case NOUGHT:
                        mButton12.setText(R.string.nought);
                        break;
                    case EMPTY:
                        mButton12.setText(R.string.empty);
                        break;
                }
                break;

            case R.id.button13:
                break;

        }

    }
}
