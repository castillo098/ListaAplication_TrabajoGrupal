package com.example.listapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.listapplication.R;

import java.util.ArrayList;

public class listAdapter extends ArrayAdapter<String> {
    private Context context;
    private ArrayList<String> list;

    public listAdapter(Context context , ArrayList<String> list) {
        super(context, R.layout.content_list);
        this.context=context;
        this.list=list;
    }
    @Override
    public int getCount(){
        return list.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View vista;

        final ViewHolder viewHolder;
        if (convertView==null || convertView.getTag()==null){
            viewHolder=new ViewHolder();
            vista= LayoutInflater.from(context).inflate(R.layout.content_list,parent,false);
            viewHolder.vItemName=(TextView)vista.findViewById(R.id.textList);
            viewHolder.vItemImage=(ImageView) vista.findViewById(R.id.img);
            vista.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder) convertView.getTag();
            vista = convertView;
        }
        viewHolder.vItemName.setText(list.get(position));
        Glide.with(vista).load("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.caracteristicas." +
                "co%2Farte-abstracto%2F&psig=AOvVaw2ub0AcQ9XvNjkWmBe8lDq7&ust=1601249922514000&source=images&cd=vfe&ved=" +
                "0CAIQjRxqFwoTCJDAn_3-h-wCFQAAAAAdAAAAABAD").into(viewHolder.vItemImage);

        return vista;
    }
    static class ViewHolder{
        protected TextView vItemName;
        protected ImageView vItemImage;
    }

}
