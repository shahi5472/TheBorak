package com.s.m.shahi.theborak.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.s.m.shahi.theborak.Model.Requests;
import com.s.m.shahi.theborak.R;
import com.s.m.shahi.theborak.ViewHolder.ChannelViewHolder;
import com.s.m.shahi.theborak.ViewHolder.GenresViewHolder;

import java.util.List;

public class GenresAdapter extends RecyclerView.Adapter<GenresViewHolder> {

    private Context context;
    private List<Requests> requestsList;

    public GenresAdapter(Context context, List<Requests> requestsList) {
        this.context = context;
        this.requestsList = requestsList;
    }

    @NonNull
    @Override
    public GenresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.genres_items, parent, false);
        return new GenresViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GenresViewHolder holder, int position) {
        holder.channel_name_tv.setText(requestsList.get(position).getName());
        holder.channel_url_tv.setText(requestsList.get(position).getUrl());
    }

    @Override
    public int getItemCount() {
        return requestsList.size();
    }
}
