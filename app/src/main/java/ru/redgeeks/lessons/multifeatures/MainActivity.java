package ru.redgeeks.lessons.multifeatures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view) {
        Button button = (Button)view;

        Intent intent = null;

        switch (button.getText().toString()) {
            case "Калькулятор":
                intent = new Intent(MainActivity.this, CalculatorActivity.class);
                break;

            case "Калькулятор v2":
                intent = new Intent(MainActivity.this, CalculatorV2Activity.class);
                break;

            case "Список":
                intent = new Intent(MainActivity.this, ItemListActivity.class);
                break;
            default:
                break;
        }

        if (intent != null) {
            startActivity(intent);
        }
    }

}
