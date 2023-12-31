package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, List<String> data) {
        super(context, R.layout.list_item, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.list_item, parent, false);

        String item = getItem(position);
        TextView textView = customView.findViewById(R.id.textView);
        textView.setText(item);

        return customView;
    }
}
