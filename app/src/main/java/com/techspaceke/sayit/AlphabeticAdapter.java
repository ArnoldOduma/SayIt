package com.techspaceke.sayit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AlphabeticAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mLetters;
    public AlphabeticAdapter(Context context, String[] letters){
        this.mContext = context;
        this.mLetters = letters;
    }

    @Override
    public int getCount() {
        return mLetters.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if(convertView == null) {
            //get layout from xml
            gridView = inflater.inflate(R.layout.alphabet_grid_item, null);

            //pull up views
            TextView letterView = gridView.findViewById(R.id.grid_item_letter);

            //set values into views
            letterView.setText("a");

        }else {
            gridView = convertView;
        }
        return gridView;
    }
}
