package com.s.m.shahi.theborak.ViewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.s.m.shahi.theborak.R;

public class ChannelViewHolder extends RecyclerView.ViewHolder {

    public TextView channel_name_tv, channel_url_tv;
    public Button genres_btn, play_btn;

    public ChannelViewHolder(@NonNull View itemView) {
        super(itemView);

        channel_name_tv = itemView.findViewById(R.id.channel_name_tv);
        channel_url_tv = itemView.findViewById(R.id.channel_url_tv);
        genres_btn = itemView.findViewById(R.id.genres_btn);
        play_btn = itemView.findViewById(R.id.play_btn);
    }
}
