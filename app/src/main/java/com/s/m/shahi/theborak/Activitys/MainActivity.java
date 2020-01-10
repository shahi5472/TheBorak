package com.s.m.shahi.theborak.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.s.m.shahi.theborak.Adapter.ChannelAdapter;
import com.s.m.shahi.theborak.Model.Requests;
import com.s.m.shahi.theborak.Model.TheBorak;
import com.s.m.shahi.theborak.R;
import com.s.m.shahi.theborak.Retrofit.TheBorakApi;
import com.s.m.shahi.theborak.Utility.Common;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private TheBorakApi api;

    private ChannelAdapter adapter;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("The Borak");

        api = Common.getAPI();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        getPosts();
    }

    private void getPosts() {
        compositeDisposable.add(api.getPost()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<TheBorak>() {
                    @Override
                    public void accept(TheBorak theBorak) throws Exception {
                        displayList(theBorak);
                    }
                }));
    }

    private void displayList(TheBorak theBorak) {
        adapter = new ChannelAdapter(this, theBorak.getRequests());
        recyclerView.setAdapter(adapter);
    }
}
