package com.learn.max.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewResult;

    private Button mButtonAC;
    private Button mButtonBC;
    private Button mButtonDivision;
    private Button mButtonMultiplication;

    private Button mButtonSeven;
    private Button mButtonEight;
    private Button mButtonNine;
    private Button mButtonSubtraction;

    private Button mButtonFour;
    private Button mButtonFive;
    private Button mButtonSix;
    private Button mButtonAdding;

    private Button mButtonOne;
    private Button mButtonTwo;
    private Button mButtonThree;
    private Button mButtonCalculateEmpty;

    private Button mButtonPercent;
    private Button mButtonZero;
    private Button mButtonDot;
    private Button mButtonCalculate;

    private void setViews() {
        mTextViewResult = findViewById(R.id.expression_view);

        mButtonAC = findViewById(R.id.btn_clear);
        mButtonBC = findViewById(R.id.btn_backspace);
        mButtonDivision = findViewById(R.id.btn_division);
        mButtonMultiplication = findViewById(R.id.btn_multiplication);

        mButtonSeven = findViewById(R.id.btn_seven);
        mButtonEight = findViewById(R.id.btn_eight);
        mButtonNine = findViewById(R.id.btn_nine);
        mButtonSubtraction = findViewById(R.id.btn_subtraction);

        mButtonFour = findViewById(R.id.btn_four);
        mButtonFive = findViewById(R.id.btn_five);
        mButtonSix = findViewById(R.id.btn_six);
        mButtonAdding = findViewById(R.id.btn_addition);

        mButtonOne = findViewById(R.id.btn_one);
        mButtonTwo = findViewById(R.id.btn_two);
        mButtonThree = findViewById(R.id.btn_three);
        mButtonCalculateEmpty = findViewById(R.id.btn_calculate_empty);

        mButtonPercent = findViewById(R.id.btn_percent);
        mButtonZero = findViewById(R.id.btn_zero);
        mButtonDot = findViewById(R.id.btn_dot);
        mButtonCalculate = findViewById(R.id.btn_calculate);
    }

    private void setOnClickListeners() {
        mButtonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText("0");
            }
        });

        mButtonBC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                if(!text.equals("0")) {
                    String nText = text.substring(0, text.length() - 1);
                    mTextViewResult.setText(nText);
                }
            }
        });

        mButtonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                String nText = text + '/';
                mTextViewResult.setText(nText);
            }
        });

        mButtonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                String nText = text + 'X';
                mTextViewResult.setText(nText);
            }
        });

        mButtonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                if(!text.equals("0")) {
                    String nText = text + '7';
                    mTextViewResult.setText(nText);
                } else {
                    mTextViewResult.setText("7");
                }
            }
        });

        mButtonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                if(!text.equals("0")) {
                    String nText = text + '8';
                    mTextViewResult.setText(nText);
                } else {
                    mTextViewResult.setText("8");
                }
            }
        });

        mButtonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                if(!text.equals("0")) {
                    String nText = text + '9';
                    mTextViewResult.setText(nText);
                } else {
                    mTextViewResult.setText("9");
                }
            }
        });

        mButtonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                String nText = text + '-';
                mTextViewResult.setText(nText);
            }
        });

        mButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                if(!text.equals("0")) {
                    String nText = text + '4';
                    mTextViewResult.setText(nText);
                } else {
                    mTextViewResult.setText("4");
                }
            }
        });

        mButtonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                if(!text.equals("0")) {
                    String nText = text + '5';
                    mTextViewResult.setText(nText);
                } else {
                    mTextViewResult.setText("5");
                }
            }
        });

        mButtonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                if(!text.equals("0")) {
                    String nText = text + '6';
                    mTextViewResult.setText(nText);
                } else {
                    mTextViewResult.setText("6");
                }
            }
        });

        mButtonAdding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                String nText = text + '+';
                mTextViewResult.setText(nText);
            }
        });

        mButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                if(!text.equals("0")) {
                    String nText = text + '1';
                    mTextViewResult.setText(nText);
                } else {
                    mTextViewResult.setText("1");
                }
            }
        });

        mButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                if(!text.equals("0")) {
                    String nText = text + '2';
                    mTextViewResult.setText(nText);
                } else {
                    mTextViewResult.setText("2");
                }
            }
        });

        mButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                if(!text.equals("0")) {
                    String nText = text + '3';
                    mTextViewResult.setText(nText);
                } else {
                    mTextViewResult.setText("3");
                }
            }
        });

        mButtonCalculateEmpty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculate();
            }
        });

        mButtonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                String nText = text + '%';
                mTextViewResult.setText(nText);
            }
        });

        mButtonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                //String nText = "";
                if(!text.equals("0")) {
                    String nText = text + '0';
                    mTextViewResult.setText(nText);
                }
            }
        });

        mButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mTextViewResult.getText().toString();
                String nText = text + '.';
                mTextViewResult.setText(nText);
            }
        });

        mButtonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculate();
            }
        });
    }

    private void Calculate() {
        String expression = mTextViewResult.getText().toString();

        if(expression.contains("+"))
        {
            String splitStr[] = expression.split("\\+");
            float left = Float.parseFloat(splitStr[0]);
            float right = Float.parseFloat(splitStr[1]);

            float result = left + right;

            mTextViewResult.setText(String.valueOf(result));
        }
        else if (expression.contains("-"))
        {
            String splitStr[] = expression.split("-");
            float left = Float.parseFloat(splitStr[0]);
            float right = Float.parseFloat(splitStr[1]);

            float result = left - right;

            mTextViewResult.setText(String.valueOf(result));
        }
        else if (expression.contains("X"))
        {
            String splitStr[] = expression.split("X");
            float left = Float.parseFloat(splitStr[0]);
            float right = Float.parseFloat(splitStr[1]);

            float result = left * right;

            mTextViewResult.setText(String.valueOf(result));
        }
        else if (expression.contains("/"))
        {
            String splitStr[] = expression.split("/");
            float left = Float.parseFloat(splitStr[0]);
            float right = Float.parseFloat(splitStr[1]);

            float result = left / right;

            mTextViewResult.setText(String.valueOf(result));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViews();
        setOnClickListeners();
    }
}
