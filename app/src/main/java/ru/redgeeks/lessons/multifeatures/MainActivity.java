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
        // получаем объект нажатой кнопки с экрана
        Button button = (Button)view;

        // объявляем параметр нового экрана
        Intent intent = null;

        // получаем текстовое значение из нажатой кнопки
        String buttonText = button.getText().toString();

        // Используем оператор Switch чтобы создать объект нового экрана соответствующий тексту
        switch (buttonText) {
            case "Калькулятор": // Создаем объект экрана демонстрирующего работу калькулятор
                intent = new Intent(MainActivity.this, CalculatorActivity.class);
                break;

            case "Калькулятор v2": // Создаем объект экрана демонстрирующего работу калькулятора v2
                intent = new Intent(MainActivity.this, CalculatorV2Activity.class);
                break;
            case "Список": // Создаем объект экрана демонстрирующего работу списка
                intent = new Intent(MainActivity.this, ItemListActivity.class);
                break;

            case "Передача данных между экранами":
                intent = new Intent(MainActivity.this, MigrateMainActivity.class);
                break;

            case "Работа с сервером":
                intent = new Intent(MainActivity.this, ServerActivity.class);
                break;

            default:
                break;
        }

        if (intent != null) {
            startActivity(intent);
        }
    }

}
