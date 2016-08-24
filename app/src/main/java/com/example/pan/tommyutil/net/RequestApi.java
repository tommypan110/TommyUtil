package com.example.pan.tommyutil.net;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;

import java.io.IOException;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by tommy.pan on 7/28/2016.
 */
public class RequestApi {
    public RequestApi Instance;
    public static Retrofit retrofit;
    public static String baseUrl = "http://172.16.97.36:8080/mdm/";

    public RequestApi getInstance() {
        if (Instance == null) {
            Instance = new RequestApi();
        }
        return Instance;
    }


    public static <T> T create(Class<T> service) {
        retrofit = new Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(getInterceptor())
                .build();
        return retrofit.create(service);
    }


    public static OkHttpClient getInterceptor() {
        OkHttpClient client = new OkHttpClient();
        client.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Response response = chain.proceed(chain.request());
                return response;
            }
        });
        return client;
    }

}
