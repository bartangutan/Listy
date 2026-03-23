package com.example.listy;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> jezykiArraylist;
    private ArrayAdapter<String> arrayAdapter;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        jezykiArraylist = new ArrayList<>();
        jezykiArraylist.add("Pearl");
        jezykiArraylist.add("Ruby");
        jezykiArraylist.add("Kotlin");
        jezykiArraylist.add("Go");

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, jezykiArraylist);
        listView = findViewById(R.id.listViewJezyki);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        //view.setBackgroundColor(Color.GRAY);
                        jezykiArraylist.remove(i);
                        arrayAdapter.notifyDataSetChanged();
                    }
                }
        );


    }
}