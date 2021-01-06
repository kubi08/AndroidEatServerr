package com.example.lenovo.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.Interface.ItemClickListener;
import com.example.lenovo.androideatserverr.Common.Common;
import com.example.lenovo.androideatserverr.R;

/**
 * Created by LENOVO on 26.01.2018.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder implements
        View.OnClickListener,
        View.OnCreateContextMenuListener

{
    public TextView food_name;
    public ImageView food_image;

    private ItemClickListener ıtemClickListener;

    public  FoodViewHolder(View itemView){
        super(itemView);

        food_name=(TextView)itemView.findViewById(R.id.food_name);
        food_image=(ImageView)itemView.findViewById(R.id.food_image);
        itemView.setOnCreateContextMenuListener(this);
        itemView.setOnClickListener(this);


    }

    public void setItemClickListener(ItemClickListener ıtemClickListener) {
        this.ıtemClickListener = ıtemClickListener;
    }


    @Override
    public void onClick(View v) {
        ıtemClickListener.onClick(v,getAdapterPosition(),false);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("İşlem seçiniz");

        menu.add(0,0, getAdapterPosition(), Common.UPDATE);
        menu.add(0,1,getAdapterPosition(),Common.DELETE);
    }
}
