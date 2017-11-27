package com.example.khan.coustomadapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by KHAN on 8/27/2017.
 */

public class WordAdapter extends ArrayAdapter<Words> {
    public WordAdapter(@NonNull Context context, @NonNull List<Words> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View theListView = convertView;

        if(theListView == null){
            theListView = LayoutInflater.from(getContext()).inflate(R.layout.words,parent,false);
        }

        Words currentWord = getItem(position);
        TextView pashtoTextView = (TextView) theListView.findViewById(R.id.textView);
        pashtoTextView.setText(currentWord.getPashtoWord());

        TextView englishWord = (TextView) theListView.findViewById(R.id.textView2);
        englishWord.setText(currentWord.getEnglishWord());

        return theListView;
    }
}
