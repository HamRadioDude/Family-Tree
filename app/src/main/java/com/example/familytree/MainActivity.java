package com.example.familytree;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // string array
        String[] famMember = {"Timm Klechak", "Cindy Klechak", "Aaron Klechak", "Colin Klechak", "Sean Klechak"};

        // setlist array display

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel, famMember));


    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        //creating an onlistitemclick method (Wait for users selection)

       switch(position) {
           case 0:
               startActivity(new Intent(MainActivity.this, dad.class));
               break;
           case 1:
               startActivity(new Intent(MainActivity.this, mom.class));
               break;
           case 2:
               startActivity(new Intent(MainActivity.this, aaron.class));
               break;
           case 3:
               startActivity(new Intent(MainActivity.this, colin.class));
               break;
           case 4:
               startActivity(new Intent(MainActivity.this, sean.class));
               break;

       }

    }

}
