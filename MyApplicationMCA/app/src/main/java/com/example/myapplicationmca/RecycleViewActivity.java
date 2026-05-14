package com.hamida.myapplicationmca;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RecycleViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recycle_view);
        recyclerView = findViewById(R.id.recyclerView);

        dataList = new ArrayList<>();
        dataList.add("Android");
        dataList.add("Java");
        dataList.add("Kotlin");
        dataList.add("Python");
        dataList.add("C++");
        dataList.add("JavaScript");

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter = new MyAdapter(dataList);
        recyclerView.setAdapter(adapter);

    }
}