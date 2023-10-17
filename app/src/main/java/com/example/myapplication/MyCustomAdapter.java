package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {

    private Context context;
    private String[] item;



    @Override
    public int getCount() {
        return item.length;
    }

    @Override
    public Object getItem(int i) {
        return item[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup parent) {
        ViewHolder holder;

        if (convertview == null) {
            convertview = LayoutInflater.from(context).inflate(R.layout.list_item_1, parent, false);
            holder = new ViewHolder();
            holder.textView = convertview.findViewById(R.id.textview);

        } else {
            holder = (ViewHolder) convertview.getTag();
        }

        holder.textView.setText(item[i]);
        return convertview;
    }

    static class ViewHolder {
        TextView textView;
    }
}