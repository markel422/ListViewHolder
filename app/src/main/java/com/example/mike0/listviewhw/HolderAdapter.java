package com.example.mike0.listviewhw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Created by mike0 on 8/22/2017.
 */

public class HolderAdapter extends ArrayAdapter<String> {

    private String[] arrayList;
    LayoutInflater mInflater;
    Context mContext;


    public HolderAdapter(Context context, String[] itemList) {
        super(context, R.layout.list_row);
        this.mContext = context;
        this.arrayList = itemList;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayList.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_row, parent, false);
            viewHolder = new MyViewHolder();
            viewHolder.myText = (TextView) convertView.findViewById(R.id.some_text);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (MyViewHolder) convertView.getTag();
        }

        viewHolder.myText.setText(arrayList[position]);

        return convertView;
    }

    private static class MyViewHolder {
        public TextView myText;
    }

}