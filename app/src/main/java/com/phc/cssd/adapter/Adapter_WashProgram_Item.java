package com.phc.cssd.adapter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.phc.cssd.R;
import com.phc.cssd.properties.Response_Item_Washprogram;

import java.util.ArrayList;

public class Adapter_WashProgram_Item extends ArrayAdapter {
    private ArrayList<Response_Item_Washprogram> listData ;
    private Context context;

    public Adapter_WashProgram_Item(AppCompatActivity aActivity, ArrayList<Response_Item_Washprogram> listData) {
        super(aActivity, 0, listData);
        this.context = aActivity;
        this.listData = listData;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View v = inflater.inflate(R.layout.list_washprogramitem_item, parent, false);

        TextView tFields1 = (TextView) v.findViewById(R.id.tItemCode);
        TextView tFields2 = (TextView) v.findViewById(R.id.tName);
        TextView tFields3 = (TextView) v.findViewById(R.id.tLife);

        tFields1.setText( listData.get(position).gettItemCode() );
        tFields2.setText( listData.get(position).gettName() );
        tFields3.setText( listData.get(position).gettLife() );

        return v;
    }
}
