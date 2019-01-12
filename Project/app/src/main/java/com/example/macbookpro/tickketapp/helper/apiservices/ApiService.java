package com.example.macbookpro.tickketapp.helper.apiservices;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    //    Input url api here
    @POST("url")
    Call<Object> getData(@Body Object objParam);
}
