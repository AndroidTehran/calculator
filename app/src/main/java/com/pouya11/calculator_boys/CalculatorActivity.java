package com.pouya11.calculator_boys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    Button[] btnNumbers = new Button[10];
    EditText txtNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btnNumbers[0] = (Button) findViewById(R.id.btn0);
        btnNumbers[1] = (Button) findViewById(R.id.btn1);
        btnNumbers[2] = (Button) findViewById(R.id.btn2);
        btnNumbers[3] = (Button) findViewById(R.id.btn3);
        btnNumbers[4] = (Button) findViewById(R.id.btn4);
        btnNumbers[5] = (Button) findViewById(R.id.btn5);
        btnNumbers[6] = (Button) findViewById(R.id.btn6);
        btnNumbers[7] = (Button) findViewById(R.id.btn7);
        btnNumbers[8] = (Button) findViewById(R.id.btn8);
        btnNumbers[9] = (Button) findViewById(R.id.btn9);
        txtNumber = (EditText) findViewById(R.id.txtNumber);

        for(Button b: btnNumbers) {
            b.setOnClickListener(new BtnNumbersClicked());
        }
    }

    class BtnNumbersClicked implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            CalculatorActivity.this.txtNumber.append(((Button) v).getText());
        }
    }
}
