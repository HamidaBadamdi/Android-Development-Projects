package com.hamida.myapplicationmca;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ContextMenuActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        textView=findViewById(R.id.textView);
        registerForContextMenu(textView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.context_menu_list, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {


        switch(item.getItemId())
        {
            case R.id.setting:

                return  true;
            case R.id.help:

                return  true;
            case R.id.about:

                return  true;

            default:
                return super.onContextItemSelected(item);



        }
    }
}