package com.example.networking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.networking.RecyclerView.ViewHolder;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<Item> items;
    private LayoutInflater layoutInflater;

    MyAdapter(Context context, List<Item> items) {
        this.layoutInflater = LayoutInflater.from(context);
        this.items = items;
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mountain, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.id.setText(items.get(position).getID());
        holder.name.setText(items.get(position).getName());
        holder.type.setText(items.get(position).getType());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
