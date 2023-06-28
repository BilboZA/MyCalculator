package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_dot,btn_plus,btn_minus,btn_mult,btn_div,btn_C,btn_equl;
    private TextView calc_result;
    private Boolean isClickequ = false;
    private double num1 = 0,num2 = 0,reslut = 0 ;
    private String op = "";
    private String strnum1,strnum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc_result = findViewById(R.id.result);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_dot = findViewById(R.id.btn_dot);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_mult = findViewById(R.id.btn_mult);
        btn_div = findViewById(R.id.btn_div);
        btn_C = findViewById(R.id.btn_C);
        btn_equl = findViewById(R.id.btn_equl);


        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_mult.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_C.setOnClickListener(this);
        btn_equl.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_0)
        {
            if (isClickequ)
            {
                calc_result.setText("");
                isClickequ = false;
            }
            calc_result.setText(calc_result.getText().toString() + "0");
        } else if (id == R.id.btn_1)
        {
            if (isClickequ)
            {
                calc_result.setText("");
                isClickequ = false;
            }
            calc_result.setText(calc_result.getText().toString() + "1");
        } else if (id == R.id.btn_2)
        {
            if (isClickequ)
            {
                calc_result.setText("");
                isClickequ = false;
            }
            calc_result.setText(calc_result.getText().toString() + "2");
        } else if (id == R.id.btn_3)
        {
            if (isClickequ)
            {
                calc_result.setText("");
                isClickequ = false;
            }
            calc_result.setText(calc_result.getText().toString() + "3");
        } else if (id == R.id.btn_4)
        {
            if (isClickequ)
            {
                calc_result.setText("");
                isClickequ = false;
            }
            calc_result.setText(calc_result.getText().toString() + "4");
        } else if (id == R.id.btn_5)
        {
            if (isClickequ)
            {
                calc_result.setText("");
                isClickequ = false;
            }
            calc_result.setText(calc_result.getText().toString() + "5");
        } else if (id == R.id.btn_6)
        {
            if (isClickequ)
            {
                calc_result.setText("");
                isClickequ = false;
            }
            calc_result.setText(calc_result.getText().toString() + "6");
        } else if (id == R.id.btn_7)
        {
            if (isClickequ)
            {
                calc_result.setText("");
                isClickequ = false;
            }
            calc_result.setText(calc_result.getText().toString() + "7");
        } else if (id == R.id.btn_8)
        {
            if (isClickequ)
            {
                calc_result.setText("");
                isClickequ = false;
            }
            calc_result.setText(calc_result.getText().toString() + "8");
        } else if (id == R.id.btn_9)
        {
            if (isClickequ)
            {
                calc_result.setText("");
                isClickequ = false;
            }
            calc_result.setText(calc_result.getText().toString() + "9");
        } else if (id == R.id.btn_C)
        {
            if (isClickequ)
            {
                calc_result.setText("");
                isClickequ = false;
            }
            calc_result.setText("");
        } else if (id == R.id.btn_dot)
        {
            if (isClickequ)
            {
                calc_result.setText("");
                isClickequ = false;
            }
            calc_result.setText(calc_result.getText().toString() + ".");
        } else if (id == R.id.btn_plus)
        {
            strnum1 = calc_result.getText().toString();
            if (strnum1.equals(""))
            {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            calc_result.setText("");
            op = "+";
            isClickequ = false;
        } else if (id == R.id.btn_minus)
        {
            strnum1 = calc_result.getText().toString();
            if (strnum1.equals(""))
            {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            calc_result.setText("");
            op = "-";
            isClickequ = false;
        } else if (id == R.id.btn_mult)
        {
            strnum1 = calc_result.getText().toString();
            if (strnum1.equals(""))
            {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            calc_result.setText("");
            op = "*";
            isClickequ = false;
        } else if (id == R.id.btn_div)
        {
            strnum1 = calc_result.getText().toString();
            if (strnum1.equals(""))
            {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            calc_result.setText("");
            op = "/";
            isClickequ = false;
        } else if (id == R.id.btn_equl)
        {
            strnum2 = calc_result.getText().toString();
            if (strnum2.equals(""))
            {
                return;
            }
            num2 = Double.parseDouble(strnum2);
            calc_result.setText("");
            double result = 0.0;
            String errResult = null;
            switch (op)
            {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0)
                    {
                        errResult = "error";
                        break;
                    }
                    result = num1 / num2;
                    break;
                default:
                    result = 0.0;
                    break;
            }
            if (errResult == "error")
            {
                calc_result.setText("error");
            }
            else
            {
                calc_result.setText(result + "");
            }
            errResult = null;
            op = "";
            isClickequ = true;
        } else
        {
            throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }
}