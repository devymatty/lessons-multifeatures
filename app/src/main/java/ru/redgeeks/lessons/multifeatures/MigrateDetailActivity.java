package ru.redgeeks.lessons.multifeatures;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MigrateDetailActivity extends AppCompatActivity {

    // Метод вызывается в момент создания экрана автоматически
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_migrate_detail);

        // Объявляем локальные переменные которые будут жить в рамках метода
        String stringParam = "";
        Integer intParam = 0;

        // Получаем объект экрана чтобы вытащить из него переданные параметры
        Intent intent = getIntent();

        // Получаем строковое значение
        stringParam = intent.getExtras().getString("StringKey");

        // Получаем интовое значение
        intParam = intent.getExtras().getInt("IntKey");


        // Вытаскиваем текстовые поля по айди
        TextView stringTextView = findViewById(R.id.textViewString);
        TextView intTextView = findViewById(R.id.textViewInt);

        // Устанавливаем значения в соответствующие текстовые поля
        stringTextView.setText(stringParam);
        intTextView.setText(intParam.toString());
    }
}