package com.example.libmanagement;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomImagTextAdapter extends ArrayAdapter {
    private String[] bookNames;
    private String[] bookTitles;
    private Integer[] imageid;
    private Activity context;

    public CustomImagTextAdapter(Activity context, String[] bookNames, String[] bookTitles, Integer[] imageid) {
        super(context, R.layout.row_item, bookNames);
        this.context = context;
        this.bookNames = bookNames;
        this.bookTitles= bookTitles;
        this.imageid = imageid;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.row_item, null, true);
        TextView textViewBookName = (TextView) row.findViewById(R.id.txtViewBookName);
        TextView textViewBookTitle = (TextView) row.findViewById(R.id.txtViewBookTitle);
        ImageView imageFlag = (ImageView) row.findViewById(R.id.imageView);

        textViewBookName.setText(bookNames[position]);
        textViewBookTitle.setText(bookTitles[position]);
        imageFlag.setImageResource(imageid[position]);
        return  row;
    }
}
