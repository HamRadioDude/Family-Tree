package com.example.familytree;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class colin extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // string array
        String[] famMember = {"Colin Klechak","Alma Encinas", "Oliver Klechak"};

        // setlist array display

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_colin, R.id.colinl, famMember));


    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        //creating an onlistitemclick method (Wait for users selection)

        switch(position) {
            case 0:
                startActivity(new Intent(colin.this, colin2.class));
                break;
            case 1:
                startActivity(new Intent(colin.this, alma.class));
                break;
            case 2:
                startActivity(new Intent(colin.this, oliver.class));
                break;

        }

    }

}
