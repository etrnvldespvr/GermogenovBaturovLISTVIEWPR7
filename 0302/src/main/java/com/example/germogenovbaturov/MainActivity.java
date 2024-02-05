package com.example.germogenovbaturov;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] countries = {"Аргентина", "Бразилия", "Чили", "Колумбия", "Уругвай", "Мы"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> mAdapter  = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, countries);
        setListAdapter(mAdapter);
        getListView().setOnItemClickListener(itemListener);
    }

    AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position) {
                case 0:
                    Intent intent_ar = new Intent(MainActivity.this, argentina.class);
                    startActivity(intent_ar);
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();

                    break;
                case 1:
                    Intent intent_br = new Intent(MainActivity.this, brasilia.class);
                    startActivity(intent_br);
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    Intent intent_cl = new Intent(MainActivity.this, chili.class);
                    startActivity(intent_cl);
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    Intent intent_co = new Intent(MainActivity.this, columbia.class);
                    startActivity(intent_co);
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    Intent intent_uy = new Intent(MainActivity.this, urugvai.class);
                    startActivity(intent_uy);
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                    break;
                case 5:
                    Intent intent_we = new Intent(MainActivity.this, we.class);
                    startActivity(intent_we);
                    Toast.makeText(getApplicationContext(), "Да, это мы, творцы", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}