package com.example.lenovo.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lenovo.Interface.ItemClickListener;
import com.example.lenovo.androideatserverr.Common.Common;
import com.example.lenovo.androideatserverr.R;

/**
 * Created by LENOVO on 28.01.2018.
 */

public class OrderViewHolder extends RecyclerView.ViewHolder implements
        View.OnLongClickListener
        {

    public TextView txtOrderId,txtOrderStatus,txtOrderPhone,txtOrderAddress;
    public Button btnEdit,btnRemove,btnDetail,btnDirection;

    private ItemClickListener itemClickListener;



    public OrderViewHolder(View itemView) {
        super(itemView);

        txtOrderId=(TextView)itemView.findViewById(R.id.order_id);
        txtOrderStatus=(TextView)itemView.findViewById(R.id.order_status);
        txtOrderPhone=(TextView)itemView.findViewById(R.id.order_phone);
        txtOrderAddress=(TextView)itemView.findViewById(R.id.order_address);

        btnEdit=(Button)itemView.findViewById(R.id.btnEdit);
        btnDetail=(Button)itemView.findViewById(R.id.btnDetail);
        btnDirection=(Button)itemView.findViewById(R.id.btnDirection);
        btnRemove=(Button)itemView.findViewById(R.id.btnRemove);




        itemView.setOnLongClickListener(this);

    }





    @Override
    public boolean onLongClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),true);
        return true;
    }
}
