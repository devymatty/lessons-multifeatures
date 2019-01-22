package ru.redgeeks.lessons.multifeatures;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class MigrateMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_migrate_main);
    }

    // Метод который вызывается при нажатии на кнопку "передать данные"
    public void clickOpenDetail(View view) {
        // Вызываем метод с кодом обработки при нажатии на кнопку
        handleOpenDetail();
    }

    // Метод с кодом который должен выполниться когда нажимают кнопку "передать данные"
    private  void  handleOpenDetail() {
        // Получаем объекты текстовых полей по айди соответственно
        EditText stringTextView = findViewById(R.id.editTextString);
        EditText intTextView = findViewById(R.id.editTextInt);

        // создаем экран деталей
        Intent intent = new Intent(MigrateMainActivity.this, MigrateDetailActivity.class);

        // получаем строковое и числовое значение из полей
        String stringValue = stringTextView.getText().toString();
        Integer intValue = Integer.valueOf(intTextView.getText().toString());

        // Передаем в созданный экран наши значения по ключам
        // в ключ stringKey пихаем текст из первого текстового поля
        intent.putExtra("StringKey", stringValue );
        // в ключ IntKey пихаем текст из второго текстового поля
        intent.putExtra("IntKey", intValue);

        // запускаем экран деталей
        startActivity(intent);
    }
}