package ru.redgeeks.lessons.multifeatures;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    TextView resultTextView;
    TextView signTextView;
    TextView firstValueTextView;

    String mathSign;
    String firstStringValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        resultTextView = findViewById(R.id.tv_result);
        signTextView = findViewById(R.id.textViewSign);
        firstValueTextView = findViewById(R.id.textViewFirstValue);

        resultTextView.setText("Введите значение");
    }

    // Методы математических действий
    public void clickClear(View view) {
        resultTextView.setText("Введите значение");

        mathSign = null;
        firstStringValue = null;
        signTextView.setText("");
        firstValueTextView.setText("");
    }

    public void clickPlus(View view) {
        mathSign = "plus";
        signTextView.setText(mathSign);
        firstStringValue = resultTextView.getText().toString();
        firstValueTextView.setText(firstStringValue);
        resultTextView.setText("");
    }

    public void clickMinus(View view) {
        mathSign = "minus";
        signTextView.setText(mathSign);
        firstStringValue = resultTextView.getText().toString();
        firstValueTextView.setText(firstStringValue);
        resultTextView.setText("");
    }

    public void clickDivision(View view) {
        mathSign = "division";
        signTextView.setText(mathSign);
        firstStringValue = resultTextView.getText().toString();
        firstValueTextView.setText(firstStringValue);
        resultTextView.setText("");
    }

    public void clickMulti(View view) {
        mathSign = "multi";
        signTextView.setText(mathSign);
        firstStringValue = resultTextView.getText().toString();
        firstValueTextView.setText(firstStringValue);

        resultTextView.setText("");
    }

    public void clickResult(View view) {
        Integer intValue1 = Integer.valueOf(firstStringValue);
        Integer intValue2 = Integer.valueOf(resultTextView.getText().toString());

        Integer intResult = 0;

        if (mathSign == "plus") {
            intResult = intValue1 + intValue2;

        } else if (mathSign == "minus") {
            intResult = intValue1 - intValue2;

        } else if (mathSign == "multi") {
            intResult = intValue1 * intValue2;

        } else if (mathSign == "division") {
            intResult = intValue1 / intValue2;
        }

        resultTextView.setText(intResult.toString());
    }

    // Методы цифр
    void updateResultText(String newValue) {
        String oldStringValue = resultTextView.getText().toString();

        if (oldStringValue == "Введите значение") {
            oldStringValue = "";
        }

        String resultStringValue = oldStringValue + newValue;
        resultTextView.setText(resultStringValue);
    }

    public void click0(View view) {
       updateResultText("0");
    }

    public void click1(View view) {
        updateResultText("1");
    }

    public void click2(View view) {
        updateResultText("2");
    }

    public void click3(View view) {
        updateResultText("3");
    }

    public void click4(View view) {
        updateResultText("4");
    }

    public void click5(View view) {
        updateResultText("5");
    }

    public void click6(View view) {
        updateResultText("6");
    }

    public void click7(View view) {
        updateResultText("7");
    }

    public void click8(View view) {
        updateResultText("8");
    }

    public void click9(View view) {
        updateResultText("9");
    }
}