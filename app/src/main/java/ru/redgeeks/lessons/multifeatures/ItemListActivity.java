package ru.redgeeks.lessons.multifeatures;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemListActivity extends AppCompatActivity {

    private static final String TITLE = "catname"; // Верхний текст
    private static final String DESCRIPTION = "description"; // ниже главного

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        // получаем экземпляр элемента ListView
        ListView listView = findViewById(R.id.listView);

        // создаем массив списков
        ArrayList<HashMap<String, Object>> catList = new ArrayList<>();

        HashMap<String, Object> hashMap;

        hashMap = new HashMap<>();
        hashMap.put(TITLE, "Рыжик"); // Название
        hashMap.put(DESCRIPTION, "Рыжий и хитрый"); // Описание
        catList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put(TITLE, "Васька");
        hashMap.put(DESCRIPTION, "Слушает да ест");
        catList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put(TITLE, "Мурзик");
        hashMap.put(DESCRIPTION, "Спит и мурлыкает");
        catList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put(TITLE, "Барсик");
        hashMap.put(DESCRIPTION, "Болеет за Барселону");
//        hashMap.put(ICON, R.drawable.cat_white);
        catList.add(hashMap);

        SimpleAdapter adapter = new SimpleAdapter(this, catList,
                R.layout.list_item, new String[]{TITLE, DESCRIPTION},
                new int[]{R.id.textview_title,
                        R.id.textview_description});

        // Устанавливаем адаптер для списка
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(itemClickListener);
    }

    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            HashMap<String, Object> itemHashMap =
                    (HashMap<String, Object>) parent.getItemAtPosition(position);
            String titleItem = itemHashMap.get(TITLE).toString();
            String descriptionItem = itemHashMap.get(DESCRIPTION).toString();
            Toast.makeText(getApplicationContext(),
                    "Вы выбрали " + titleItem + ". Он " + descriptionItem, Toast.LENGTH_SHORT)
                    .show();
        }
    };

}
