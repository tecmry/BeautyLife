package com.example.mao.beautylife.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mao.beautylife.R;

/**
 * Created by -- Mao on 2017/12/2.
 */

public class TwoRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private class ItemHolder extends RecyclerView.ViewHolder{

        ImageView imageViewOne, imageViewTwo;

        private ItemHolder(View itemView) {
            super(itemView);
            imageViewOne = itemView.findViewById(R.id.two_item_image_one);
            imageViewTwo = itemView.findViewById(R.id.two_item_image_two);
        }

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.community_two_item, parent, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
