package com.re.newk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Hero>{
    private List<Hero> heroList;
    private Context mCtx;
    public ListViewAdapter(List<Hero> heroList, Context mCtx) {
        super(mCtx,R.layout.list_items, heroList);
        this.heroList = heroList;
        this.mCtx = mCtx;

    }


    @Override
    public View getView(int position,View convertView,  ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View listViewItem = inflater.inflate(R.layout.list_items,null,true);
        TextView textViewName  = listViewItem.findViewById(R.id.textViewName);
        TextView textViewImageurl = listViewItem.findViewById(R.id.textViewImageUrl);

        Hero hero = heroList.get(position);
        textViewName.setText(hero.getName());
        textViewImageurl.setText(hero.getImageurl());
        return listViewItem;
    }
}
