package com.example.cw7;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Items> {
    List<Items> itemsArrayList;

    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super( context, resource , objects);
        itemsArrayList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


    View view = LayoutInflater.from(getContext()).inflate(R.layout.items , parent , false);
        Items currentItems = itemsArrayList.get(position);

        TextView itemName = view.findViewById(R.id.itemName);
        ImageView itemImage = view.findViewById(R.id.itemImage);
        TextView itemprice =  view.findViewById(R.id.itemprice);


        itemName.setText(currentItems.getItemName());
        itemImage.setImageResource(currentItems.getItemImage());
        itemprice.setText(String.valueOf(currentItems.getItemprice()));




        ImageView i2 = view.findViewById(R.id.i2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemsArrayList.remove(position);
                notifyDataSetChanged();
            }
        });

        return view;




    }
}


