package ru.redgeeks.lessons.multifeatures;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class AlertAndRatingActivity extends AppCompatActivity {

    private RatingBar rating;
    private TextView text_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_and_rating);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        Button btn = findViewById(R.id.aar_button);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder a_builder = new AlertDialog.Builder(AlertAndRatingActivity.this);
                        a_builder.setMessage("Вы хотите закрыть приложение?")
                                .setCancelable(false)
                                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        finish(); // полностью закрывает приложение
                                    }
                                })
                                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alert = a_builder.create();
                        alert.setTitle("Закрытие приложения");
                        alert.show();
                    }
                }
        );


        rating = findViewById(R.id.ratingBar);
        text_show = findViewById(R.id.aar_textView);

        rating.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        text_show.setText("Значение: " + String.valueOf(rating));
                    }
                }
        );

    }

}
