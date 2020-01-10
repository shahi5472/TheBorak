package com.s.m.shahi.theborak.Retrofit;

import com.s.m.shahi.theborak.Model.TheBorak;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface TheBorakApi {

    @GET("a1e9eb0628616c388618")
    Observable<TheBorak> getPost();
}
