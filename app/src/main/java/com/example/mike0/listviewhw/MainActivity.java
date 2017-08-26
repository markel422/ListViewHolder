package com.example.mike0.listviewhw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String itemList[] = new String[5000];
        itemList[0] = "Nick";
        itemList[1] = "Sam";
        itemList[2] = "Judy";
        itemList[3] = "John";
        itemList[4] = "Ralph";
        itemList[5] = "Chris";// String Array of items

        for (int i = 6; i < 5000; i++) {
            itemList[i] = String.valueOf(i);
        }

        ListAdapter myAdapterArray = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemList); // The Adapter************
        ListView myListView = (ListView)  findViewById(R.id.myListView); // Variable representing the created ListView
        myListView.setAdapter(myAdapterArray); // Have ListView recognize myAdapterArray as the Adapter to update the ListView myListView


    }
}
