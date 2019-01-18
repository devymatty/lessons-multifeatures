package ru.redgeeks.lessons.multifeatures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButtonButtonCounter(View view) {
        Intent intent = new Intent(MainActivity.this, ButtonCounterActivity.class);
        startActivity(intent);
    }

    public void clickButtonCalculator(View view) {
        Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
        startActivity(intent);
    }

}
