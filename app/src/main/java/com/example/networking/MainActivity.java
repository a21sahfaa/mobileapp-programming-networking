package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.networking.RecyclerView.ViewHolder;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.reflect.TypeToken;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";


    private ArrayList<Item> mountains;
    private MyAdapter adapter;
    private ViewHolder viewholder;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        new JsonFile(this, this).execute(JSON_URL);

        recyclerView = findViewById(R.id.recyclerview);
        mountains = new ArrayList<Item>();
        adapter = new MyAdapter(mountains);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    public void onPostExecute(String json) {
// Create GSON object to perform marshall/unmarshall operations
        Gson gson = new Gson();
        Type type = new TypeToken <ArrayList<Item>>(){}.getType();
        ArrayList<Item> data = gson.fromJson(json, type);
        mountains.addAll(data);

        adapter.notifyDataSetChanged();
        Log.d("MainActivity", json);
    }

}
