package ru.redgeeks.lessons.multifeatures;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorV2Activity extends AppCompatActivity {
        TextView resultTextView, signTextView;

        String mathSign, firstStringValue;
        Boolean isNeedClearText = false;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_calculator_v2);

            resultTextView = findViewById(R.id.resultTextView);
            signTextView = findViewById(R.id.textViewSign);

            resultTextView.setText("Введите значение");
        }

        void handleMathButtonClick(String sign) {
            if (sign.equals("=")) {
                calculateResult();

            } else {
                mathSign = sign;
                signTextView.setText(mathSign);
                firstStringValue = resultTextView.getText().toString();
                isNeedClearText = true;
            }
        }

        void calculateResult() {
            Integer intValue1 = Integer.valueOf(firstStringValue);
            Integer intValue2 = Integer.valueOf(resultTextView.getText().toString());

            Integer intResult = 0;

            if (mathSign.equals("+")) {
                intResult = intValue1 + intValue2;

            } else if (mathSign.equals("-")) {
                intResult = intValue1 - intValue2;

            } else if (mathSign.equals("*")) {
                intResult = intValue1 * intValue2;

            } else if (mathSign.equals("/")) {
                intResult = intValue1 / intValue2;
            }

            resultTextView.setText(intResult.toString());
        }

        void handleClearButtonClick() {
            resultTextView.setText("Введите значение");

            mathSign = null;
            firstStringValue = null;
            signTextView.setText("");
        }

        void handleNumberButtonClick(String number) {
            String oldStringValue = resultTextView.getText().toString();

            if (oldStringValue == "Введите значение" || isNeedClearText == true) {
                isNeedClearText = false;
                oldStringValue = "";
            }

            String resultStringValue = oldStringValue + number;
            resultTextView.setText(resultStringValue);
        }

        // Методы математических действий
        public void clickButton(View view) {
            Button clickedButton = (Button)view;
            String buttonText = clickedButton.getText().toString();

            if (buttonText.equals("+") ||
                    buttonText.equals("-") ||
                    buttonText.equals("*") ||
                    buttonText.equals("/") ||
                    buttonText.equals("=")) {

                handleMathButtonClick(buttonText);

            } else if (buttonText.equals("C")) {
                handleClearButtonClick();

            } else {
                handleNumberButtonClick(buttonText);
            }
        }
}