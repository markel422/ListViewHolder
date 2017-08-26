package com.example.mike0.listviewhw;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class ViewHolderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_holder);

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

        ListAdapter myAdapterArray = new HolderAdapter(ViewHolderActivity.this, itemList); // The Adapter************
        ListView myListView = (ListView) findViewById(R.id.myListView); // Variable representing the created ListView
        myListView.setAdapter(myAdapterArray); // Have ListView recognize myAdapterArray as the Adapter to update the ListView myListView
    }


}


