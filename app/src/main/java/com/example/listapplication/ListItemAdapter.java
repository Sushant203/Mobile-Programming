package com.example.listapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listapplication.R;

public class ListItemAdapter extends ArrayAdapter<String> {
Activity context;
String[] title;
String[] description;
int[] imageResource;

public ListItemAdapter(Activity context, String[] title, String[] description, int[] imageResource){
    super(context, R.layout.list_item,title);
    this.context= context;
    this.title=title;
    this.description= description;
    this.imageResource= imageResource;
}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater li= context.getLayoutInflater();
        View vw= li.inflate(R.layout.list_item, null, true);
        ImageView imageFld= vw.findViewById(R.id.imageView);
        TextView titleFld= vw.findViewById(R.id.textView);
        TextView descriptionFld= vw.findViewById(R.id.textView2);

        titleFld.setText(title[position]);
        descriptionFld.setText(description[position]);
        imageFld.setImageResource(imageResource[position]);
                return vw;

    }
}
