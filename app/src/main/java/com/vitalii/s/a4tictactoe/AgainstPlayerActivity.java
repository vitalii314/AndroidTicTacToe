package com.vitalii.s.a4tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import playground.SimplePlayGround;
import playground.State;

/**
 * Created by user on 14.08.2016.
 */
public class AgainstPlayerActivity extends AppCompatActivity implements View.OnClickListener {

    Button mButton11;
    Button mButton12;
    Button mButton13;
    Button mButton21;
    Button mButton22;
    Button mButton23;
    Button mButton31;
    Button mButton32;
    Button mButton33;
    Button mButtonStartPlayer;
    TextView mResultText;
    SimplePlayGround simplePlayground = new SimplePlayGround();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_against_player);
        mResultText = (TextView)findViewById(R.id.textResult);
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
        cleanAllButtons();

    }


    //    public void Button11Clicked(View view) {
//        mTextView.setText("Я хожу "+ ++count);
//
//    }

    public void onButtonStartAgainstPlayerClick(View view) {
        simplePlayground.start();
        cleanAllButtons();
    }

    public void onButtonStartAgainstCpuClick(View view) {
        Intent intent = new Intent(AgainstPlayerActivity.this,AgainstCpuActivity.class );
        startActivity(intent);
    }




    @Override
    public void onClick(View view) {
        if (simplePlayground.getBoard() != null) {
            switch (view.getId()) {
                case R.id.button11:
                    State state11 = simplePlayground.doStep(0, 0);
                    switch (simplePlayground.getBoard().cells[0][0].content) {
                        case CROSS:
                            mButton11.setText(R.string.cross);
                            mButton11.setTextColor(ContextCompat.getColor(this,R.color.cross_color));
                            break;
                        case NOUGHT:
                            mButton11.setText(R.string.nought);
                            mButton11.setTextColor(ContextCompat.getColor(this, R.color.nought_color));
                            break;
                        case EMPTY:
                            mButton11.setText(R.string.empty);
                            break;
                    }
                    printWinner(state11);
                    break;

                case R.id.button12:
                    State state12 = simplePlayground.doStep(0, 1);
                    switch (simplePlayground.getBoard().cells[0][1].content) {
                        case CROSS:
                            mButton12.setText(R.string.cross);
                            mButton12.setTextColor(ContextCompat.getColor(this,R.color.cross_color));
                            break;
                        case NOUGHT:
                            mButton12.setText(R.string.nought);
                            mButton12.setTextColor(ContextCompat.getColor(this, R.color.nought_color));
                            break;
                        case EMPTY:
                            mButton12.setText(R.string.empty);
                            break;
                    }
                    printWinner(state12);
                    break;

                case R.id.button13:

                    State state13 = simplePlayground.doStep(0, 2);
                    switch (simplePlayground.getBoard().cells[0][2].content) {
                        case CROSS:
                            mButton13.setText(R.string.cross);
                            mButton13.setTextColor(ContextCompat.getColor(this,R.color.cross_color));
                            break;
                        case NOUGHT:
                            mButton13.setText(R.string.nought);
                            mButton13.setTextColor(ContextCompat.getColor(this, R.color.nought_color));
                            break;
                        case EMPTY:
                            mButton13.setText(R.string.empty);
                            break;
                    }
                    printWinner(state13);
                    break;

                case R.id.button21:
                    State state21 = simplePlayground.doStep(1, 0);
                    switch (simplePlayground.getBoard().cells[1][0].content) {
                        case CROSS:
                            mButton21.setText(R.string.cross);
                            mButton21.setTextColor(ContextCompat.getColor(this,R.color.cross_color));
                            break;
                        case NOUGHT:
                            mButton21.setText(R.string.nought);
                            mButton21.setTextColor(ContextCompat.getColor(this, R.color.nought_color));
                            break;
                        case EMPTY:
                            mButton21.setText(R.string.empty);
                            break;
                    }
                    printWinner(state21);
                    break;

                case R.id.button22:
                    State state22 = simplePlayground.doStep(1, 1);
                    switch (simplePlayground.getBoard().cells[1][1].content) {
                        case CROSS:
                            mButton22.setText(R.string.cross);
                            mButton22.setTextColor(ContextCompat.getColor(this,R.color.cross_color));
                            break;
                        case NOUGHT:
                            mButton22.setText(R.string.nought);
                            mButton22.setTextColor(ContextCompat.getColor(this, R.color.nought_color));
                            break;
                        case EMPTY:
                            mButton22.setText(R.string.empty);
                            break;

                    }
                    printWinner(state22);
                    break;

                case R.id.button23:
                    State state23 = simplePlayground.doStep(1, 2);
                    switch (simplePlayground.getBoard().cells[1][2].content) {
                        case CROSS:
                            mButton23.setText(R.string.cross);
                            mButton23.setTextColor(ContextCompat.getColor(this,R.color.cross_color));
                            break;
                        case NOUGHT:
                            mButton23.setText(R.string.nought);
                            mButton23.setTextColor(ContextCompat.getColor(this, R.color.nought_color));
                            break;
                        case EMPTY:
                            mButton23.setText(R.string.empty);
                            break;
                    }
                    printWinner(state23);
                    break;

                case R.id.button31:
                    State state31 = simplePlayground.doStep(2, 0);
                    switch (simplePlayground.getBoard().cells[2][0].content) {
                        case CROSS:
                            mButton31.setText(R.string.cross);
                            mButton31.setTextColor(ContextCompat.getColor(this,R.color.cross_color));
                            break;
                        case NOUGHT:
                            mButton31.setText(R.string.nought);
                            mButton31.setTextColor(ContextCompat.getColor(this, R.color.nought_color));
                            break;
                        case EMPTY:
                            mButton31.setText(R.string.empty);
                            break;
                    }
                    printWinner(state31);
                    break;

                case R.id.button32:
                    State state32 = simplePlayground.doStep(2, 1);
                    switch (simplePlayground.getBoard().cells[2][1].content) {
                        case CROSS:
                            mButton32.setText(R.string.cross);
                            mButton32.setTextColor(ContextCompat.getColor(this,R.color.cross_color));
                            break;
                        case NOUGHT:
                            mButton32.setText(R.string.nought);
                            mButton32.setTextColor(ContextCompat.getColor(this, R.color.nought_color));
                            break;
                        case EMPTY:
                            mButton32.setText(R.string.empty);
                            break;
                    }
                    printWinner(state32);
                    break;

                case R.id.button33:
                    State state33 = simplePlayground.doStep(2, 2);
                    switch (simplePlayground.getBoard().cells[2][2].content) {
                        case CROSS:
                            mButton33.setText(R.string.cross);
                            mButton33.setTextColor(ContextCompat.getColor(this,R.color.cross_color));
                            break;
                        case NOUGHT:
                            mButton33.setText(R.string.nought);
                            mButton33.setTextColor(ContextCompat.getColor(this, R.color.nought_color));
                            break;
                        case EMPTY:
                            mButton33.setText(R.string.empty);
                            break;
                    }
                    printWinner(state33);
                    break;
            }

        }
    }


    public void cleanAllButtons(){
        mButton11.setText(R.string.empty);
        mButton12.setText(R.string.empty);
        mButton13.setText(R.string.empty);
        mButton21.setText(R.string.empty);
        mButton22.setText(R.string.empty);
        mButton23.setText(R.string.empty);
        mButton31.setText(R.string.empty);
        mButton32.setText(R.string.empty);
        mButton33.setText(R.string.empty);
        mResultText.setText(R.string.empty);
    }



    public void printWinner(State state){
        switch (state){
            case CROSS_WON :
                mResultText.setText(R.string.xWin);
                break;
            case NOUGHT_WON:
                mResultText.setText(R.string.oWin);
                break;
            case DRAW:
                mResultText.setText(R.string.draw);
                break;
        }
    }



}
