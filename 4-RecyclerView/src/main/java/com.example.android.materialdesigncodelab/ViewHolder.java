package com.example.android.materialdesigncodelab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cdiazmo on 1/2/17.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView picture;
    public TextView name;
    public TextView description;
    public ViewHolder(LayoutInflater inflater, ViewGroup parent ) {
        super(inflater.inflate(R.layout.item_card, parent, false));
        picture = (ImageView) itemView.findViewById(R.id.card_image);
        name = (TextView) itemView.findViewById(R.id.card_title);
        description = (TextView) itemView.findViewById(R.id.card_text);
    }
}