package com.phc.cssd.adapter;

/**
 * Created by HPBO on 1/11/2018.
 */

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.phc.cssd.R;
import com.phc.cssd.SendSterile_MainActivity;
import com.phc.cssd.properties.pCustomer;

import java.util.ArrayList;

/**
 * Created by User on 20/7/2560.
 */


public class SendSterile_DocListDetailAdapter extends ArrayAdapter {

    private ArrayList<pCustomer> listData;
    private AppCompatActivity aActivity;
    String CheckAll = null;
    String CheckAllAd = "1";

    public SendSterile_DocListDetailAdapter(AppCompatActivity aActivity, ArrayList<pCustomer> listData,String CheckAll) {
        super(aActivity, 0, listData);
        this.aActivity= aActivity;
        this.listData = listData;
        this.CheckAll = CheckAll;
    }

    @Override
    public int getCount() { return listData.size(); }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) aActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View v = inflater.inflate(R.layout.list_getdocdetail_sendsterile, parent, false);
        final pCustomer pCus = listData.get(position);
        final int xps = position;
        TextView txtitemname = (TextView) v.findViewById(R.id.itemname);
        TextView txtxqty = (TextView) v.findViewById(R.id.xqty);
        TextView textView49 = (TextView) v.findViewById(R.id.textView49);
        final ImageView checkBoxsub = (ImageView) v.findViewById(R.id.checkBoxsub);
        final ImageView un_checkBoxsub = (ImageView) v.findViewById(R.id.un_checkBoxsub);
        final ImageView Open_pic = (ImageView) v.findViewById(R.id.Open_pic);
        final TextView Open_pic_Text = (TextView) v.findViewById(R.id.Open_pic_Text);

        checkBoxsub.setVisibility(View.GONE);

//        if (!listData.get(position).getRemarkAdmin().equals("0")){
//            checkBoxsub.setChecked(false);
//            txtitemname.setTextColor(Color.RED);
//            txtxqty.setTextColor(Color.RED);
//            textView49.setTextColor(Color.RED);
//        }else {
//            checkBoxsub.setChecked(true);
//            txtitemname.setTextColor(Color.BLACK);
//            txtxqty.setTextColor(Color.BLACK);
//            textView49.setTextColor(Color.BLACK);
//        }

        if (CheckAll == CheckAllAd) {
            Log.d("YUYU",listData.get(position).getRemarkAdmin()+"");
            if (!listData.get(position).getRemarkAdmin().equals("0")){
                checkBoxsub.setVisibility(View.GONE);
                un_checkBoxsub.setVisibility(View.VISIBLE);
                txtitemname.setTextColor(Color.RED);
                txtxqty.setTextColor(Color.RED);
                textView49.setTextColor(Color.RED);
            }else {
                checkBoxsub.setVisibility(View.VISIBLE);
                un_checkBoxsub.setVisibility(View.GONE);
            }
        } else {
            checkBoxsub.setVisibility(View.GONE);
            un_checkBoxsub.setVisibility(View.VISIBLE);
        }

        if (listData.get(position).getIsPicture().equals("0")){
            Open_pic.setVisibility(View.GONE);
            Open_pic_Text.setVisibility(View.GONE);
        }

        Open_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((SendSterile_MainActivity)aActivity).LoadImg(listData.get(position).getRemarkItemCode(),listData.get(position).getRemarkDocNo(),listData.get(position).getItemID(),listData.get(position).getUsageCode(),"remark");
            }
        });

        checkBoxsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listData.get(position).getRemarkAdmin().equals("0")){
                    if (un_checkBoxsub.getVisibility() == View.GONE){
                        checkBoxsub.setVisibility(View.GONE);
                        un_checkBoxsub.setVisibility(View.VISIBLE);
                        ((SendSterile_MainActivity)aActivity).OpenDialog(listData.get(position).getItemname(),"0",listData.get(position).getXqty(),listData.get(position).getQtyItemDetail());
                    }else {
                        checkBoxsub.setVisibility(View.VISIBLE);
                        un_checkBoxsub.setVisibility(View.GONE);
                    }
                }
            }
        });

        txtitemname.setPaintFlags(txtitemname.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        txtitemname.setText(listData.get(position).getItemname());
        txtitemname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((SendSterile_MainActivity)aActivity).LoadImg(listData.get(position).getItemcode(),"2",listData.get(position).getUsageCode(),listData.get(position).getItemname(),"noremark");
            }
        });

        Log.d("LJDLJF",listData.get(position).getXqty());
        Log.d("LJDLJF",listData.get(position).getQtyItemDetail());
        int x1 = Integer.parseInt(listData.get(position).getXqty());
        int x2 = Integer.parseInt(listData.get(position).getQtyItemDetail());
        if (x1 == x2){
            txtxqty.setText("ขาด "+x2);
        }else {
            if (x2 != 0){
                int x1_1 = x1 - x2;
                txtxqty.setText(x1_1+" ( ขาด "+x2+" )");
            }else {
                txtxqty.setText(listData.get(position).getXqty());
            }
        }
        return v;
    }
}