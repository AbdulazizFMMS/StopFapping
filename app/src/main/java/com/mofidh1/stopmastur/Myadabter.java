package com.mofidh1.stopmastur;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Myadabter extends BaseAdapter {
    Context context;
    ArrayList<String> data;
    public Myadabter(Context context, ArrayList<String> data){
        this.context=context;
        this.data=data;

    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        if(v==null){
           v= LayoutInflater.from(context).inflate(R.layout.mysimple_list_item_1,null,false);
        }
        String name=data.get(position);
        TextView tv=v.findViewById(R.id.text_shape);
        tv.setText(name);

        return v;
    }
}
