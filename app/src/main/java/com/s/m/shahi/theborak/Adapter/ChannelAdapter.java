package com.s.m.shahi.theborak.Adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.s.m.shahi.theborak.Activitys.PlayTVActivity;
import com.s.m.shahi.theborak.Model.Requests;
import com.s.m.shahi.theborak.R;
import com.s.m.shahi.theborak.ViewHolder.ChannelViewHolder;

import java.util.List;

public class ChannelAdapter extends RecyclerView.Adapter<ChannelViewHolder> {

    private Context context;
    private List<Requests> requestsList;

    public ChannelAdapter(Context context, List<Requests> requestsList) {
        this.context = context;
        this.requestsList = requestsList;
    }

    @NonNull
    @Override
    public ChannelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.channel_item, parent, false);
        return new ChannelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChannelViewHolder holder, final int position) {
        holder.channel_name_tv.setText(requestsList.get(position).getName());
        holder.channel_url_tv.setText(requestsList.get(position).getUrl());

        holder.genres_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTvDialog(requestsList);
            }
        });

        holder.play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, PlayTVActivity.class).putExtra("play", requestsList.get(position)));
            }
        });
    }

    private void showTvDialog(List<Requests> requestsList) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Genres TV");

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.custom_dialog, null);
        builder.setView(view);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setHasFixedSize(true);

        GenresAdapter adapter = new GenresAdapter(context, requestsList);
        recyclerView.setAdapter(adapter);

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public int getItemCount() {
        return requestsList.size();
    }
}
