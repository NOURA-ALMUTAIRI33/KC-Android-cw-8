package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <Items>  itemsArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Items i1 = new Items("cheese",1500,R.drawable.cheese);
        Items i2 = new Items("chocolate",1.400,R.drawable.chocolate);
        Items i3 = new Items("coffe" ,1.750,R.drawable.coffee );
        Items i4 = new Items("frise",2.00,R.drawable.fries);


        itemsArrayList.add(i1);//0
        itemsArrayList.add(i2);//1
        itemsArrayList.add(i3);//2
        itemsArrayList.add(i4);





        ItemAdapter itemAdapter = new ItemAdapter(this ,0 , itemsArrayList );
       ListView listView = findViewById(R.id.listview);

       listView.setAdapter(itemAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Items currentItems = itemsArrayList.get(i);
                Intent intent = new Intent(MainActivity.this , DetalilsActivity.class);
                intent.putExtra("Item",  currentItems);


                startActivity(intent);





            }
        });


























    }
}