package com.example.listapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.listapplication.adapter.listAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListAdapter listItemAdapter;
    private ArrayList<String> listaNombres= new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        llenarArreglo();
        listItemAdapter = new listAdapter(this,listaNombres);
        listView.setAdapter(listItemAdapter);
    }
    public void llenarArreglo(){
        listaNombres.add("Datos 1");
        listaNombres.add("Datos 2");
        listaNombres.add("Datos 3");
        listaNombres.add("Datos 4");
    }
}