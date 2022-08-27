package com.example.cw7;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import kotlin.jvm.Volatile;

public class DetalilsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Bundle bundle = getIntent().getExtras();
        Items delieveritem  =  (Items) bundle.getSerializable("Item");

        TextView itemNameTextView = findViewById(R.id.Tv1);
        ImageView itemimage = findViewById(R.id.i1);


        itemNameTextView.setText(delieveritem.getItemName());
        itemimage.setImageResource(delieveritem.getItemImage());




    }

    }
