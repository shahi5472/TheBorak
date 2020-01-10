package com.s.m.shahi.theborak.Utility;

import com.s.m.shahi.theborak.Retrofit.RetrofitClient;
import com.s.m.shahi.theborak.Retrofit.TheBorakApi;

public class Common {
    private static final String BASE_URL = "https://www.getpostman.com/collections/";

    public static TheBorakApi getAPI() {
        return RetrofitClient.getClient(BASE_URL).create(TheBorakApi.class);
    }
}
