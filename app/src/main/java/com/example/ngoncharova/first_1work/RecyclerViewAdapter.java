package com.example.ngoncharova.first_1work;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.squareup.picasso.Picasso;



public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private int[] recycle_images;
    private Context context;


    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView icon;

        public ViewHolder(View itemView) {
            super(itemView);
            icon = (ImageView) itemView;
        }

    }

    public RecyclerViewAdapter(Context context, int[] recycle_images) {
        this.recycle_images = recycle_images;
        this.context = context;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = new ImageView(context);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Picasso.with(context)
                .load(recycle_images[position])
                .resize(400, 300)
                .into(holder.icon);
    }

    @Override
    public int getItemCount() {
        return recycle_images.length;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
