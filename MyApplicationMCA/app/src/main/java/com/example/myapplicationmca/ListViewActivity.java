/*
Program Name: ListView Dynamic Items Activity

Description:
This Android program demonstrates how to dynamically add
and remove items in a ListView.

Features:
- Add items using EditText and Button
- Remove items by clicking on list entries
- Displays updated list dynamically

Author: Hamida Badamdi
*/
package com.hamida.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    EditText edtItem;
    Button btnAdd, btnRemove;
    ListView listView;

    ArrayAdapter<String> adapter;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        edtItem = findViewById(R.id.edtItem);
        btnAdd = findViewById(R.id.btnAdd);
        btnRemove = findViewById(R.id.btnRemove);
        listView = findViewById(R.id.listview);

        list = new ArrayList<>();
        adapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String item = edtItem.getText().toString().trim();
                if(!item.isEmpty())
                {
                    list.add(item);
                    adapter.notifyDataSetChanged();
                    edtItem.setText("");
                }
                else
                {
                    Toast.makeText(ListViewActivity.this, "Enter Something!", Toast.LENGTH_SHORT).show();
                }

            }
        });

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               list.remove(i);
               adapter.notifyDataSetChanged();
           }
       });
    }
}