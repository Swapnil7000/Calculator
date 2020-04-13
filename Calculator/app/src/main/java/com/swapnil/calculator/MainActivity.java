package com.swapnil.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_7, btn_8, btn_9, btn_mul, btn_clear, btn_add, btn_sub, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_div, btn_zero, btn_twozero, btn_dot, btn_eq, btn_rem;
    EditText input, output;
    private boolean IsPlusClicked, IsMinusClicked, IsMulClicked, IsDivideClicked, IsRemClicked;
    private float mNum1, mNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_zero = (Button) findViewById(R.id.btn_0);
        btn_rem = (Button) findViewById(R.id.btn_per);
        btn_sub = (Button) findViewById(R.id.btn_minus);
        btn_div = (Button) findViewById(R.id.btn_divide);
        btn_twozero = (Button) findViewById(R.id.btn_twozero);
        btn_eq = (Button) findViewById(R.id.btn_equal);
        btn_add = (Button) findViewById(R.id.btn_plus);
        btn_dot = (Button) findViewById(R.id.btn_dot);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_clear = (Button) findViewById(R.id.btn_C);
        input = (EditText) findViewById(R.id.view_in);
        output = (EditText) findViewById(R.id.view_res);
        btn_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNum2 = Float.parseFloat(input.getText() + "");
                if (IsPlusClicked == true) {
                    output.setText((mNum1 + mNum2) + "");
                    IsPlusClicked = false;
                    input.setText("");
                }
                if (IsMinusClicked == true) {
                    output.setText(mNum1 - mNum2 + "");
                    IsMinusClicked = false;
                    input.setText("");
                }
                if (IsDivideClicked == true) {
                    output.setText(mNum1 / mNum2 + "");
                    IsDivideClicked = false;
                    input.setText("");
                }
                if (IsRemClicked == true) {
                    output.setText(mNum1 + (mNum1 * mNum2) / 100 + "");
                    IsRemClicked = false;
                    input.setText("");
                }
                if (IsMulClicked == true) {
                    output.setText(mNum1 * mNum2 + "");
                    IsMulClicked = false;
                    input.setText("");
                }
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + ".");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNum1 = Float.parseFloat(input.getText() + "");
                IsPlusClicked = true;
                input.setText(input.getText() + "+");
                input.setText(null);

            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNum1 = Float.parseFloat(input.getText() + "");
                IsMinusClicked = true;
                input.setText(input.getText() + "-");
                input.setText(null);

            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNum1 = Float.parseFloat(input.getText() + "");
                IsMulClicked = true;
                input.setText(input.getText() + "*");
                input.setText(null);

            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNum1 = Float.parseFloat(input.getText() + "");
                IsDivideClicked = true;
                input.setText(input.getText() + "/");
                input.setText(null);

            }
        });
        btn_rem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNum1 = Float.parseFloat(input.getText() + "");
                IsRemClicked = true;
                input.setText(input.getText() + "%");
                input.setText(null);

            }
        });
        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "0");
            }
        });
        btn_twozero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "00");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "9");
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                mNum2 = 0;
                mNum1 = 0;
            }
        });
    }
}
