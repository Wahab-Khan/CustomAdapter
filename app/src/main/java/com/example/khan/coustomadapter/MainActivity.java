package com.example.khan.coustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView theListView = (ListView) findViewById(R.id.listview);

        //ArrayList<String> theList = new ArrayList<String>();
        ArrayList<Words> theList = new ArrayList<>();
        theList.add(new Words("yo" , "one"));
        theList.add(new Words("dua" , "two"));
        theList.add(new Words("dry" , "three"));
        theList.add(new Words("slor" , "four"));
        theList.add(new Words("pinza" , "five"));
        theList.add(new Words("shpak" , "six"));
        theList.add(new Words("avah" , "seven"));
        theList.add(new Words("atah" , "eight"));
        theList.add(new Words("nha" , "nine"));
        theList.add(new Words("lus" , "ten"));

        WordAdapter theadapter = new WordAdapter(this,theList);
        theListView.setAdapter(theadapter);
    }
}
