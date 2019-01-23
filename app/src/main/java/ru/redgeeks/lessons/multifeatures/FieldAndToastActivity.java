package ru.redgeeks.lessons.multifeatures;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FieldAndToastActivity extends AppCompatActivity {

    private EditText pass;
    private Button btn, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field_and_toast);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        pass = findViewById(R.id.fat_editText);
        btn = findViewById(R.id.fat_btn);
        btn2 = findViewById(R.id.fat_btn2);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btn.setText("Done");
                        btn.setBackgroundTintList(ColorStateList.valueOf(Color.RED));

                        Toast toast = Toast.makeText(FieldAndToastActivity.this, pass.getText(), Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
        );

        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btn.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));

                        Toast toast = Toast.makeText(FieldAndToastActivity.this, "Мы все поменяли", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
        );
    }
}
