package com.example.customlistview;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Data
        List<String> data = new ArrayList<>();
        data.add("Item 1");
        data.add("Item 2");
        data.add("Item 3");

        // Adapter
        CustomAdapter adapter = new CustomAdapter(this, data);

        // ListView
        ListView listView = findViewById(R.id.customListView);
        listView.setAdapter(adapter);
    }
}
