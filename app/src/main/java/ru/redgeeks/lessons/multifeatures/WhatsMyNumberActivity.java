package ru.redgeeks.lessons.multifeatures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WhatsMyNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_my_number);
    }

    void myFirstFunction() {
        // Это моя функция я ее создал
    }

    void mySecondMethod() {
        // Это мой метод я его создал сам
        // ФУнкция и метод это одно и тоже
    }


    public void clickDoneButton(View view) {
        // это функция привязанная к onClick

        // а сейчас я вызову свою собственную первую функцию
        myFirstFunction();

        // а сейчас я вызову свою вторую функцию
        mySecondMethod();
    }


}
