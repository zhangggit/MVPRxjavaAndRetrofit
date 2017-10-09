package com.example.zhanggang.mvprxjavaandretrofit.model;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zhanggang on 2017/10/9.
 */

public class RetrofitManager {

    private Retrofit retrofit;
    private static final String BASE_URL="http://gank.io/api/history/content/1/1/";

    //单列模式
    public static class SingleHolder{
        private static final RetrofitManager intance = new RetrofitManager(BASE_URL);
    }
    //调用默认的RetrofitManager  默认是单列模式中的
    public static RetrofitManager getDefalut(){
        return SingleHolder.intance;
    }
    //不是默认的路径网址的话，就调用这个 构造一个新的RetrofitManager
    public static RetrofitManager getNewRetrofit(String baseurl){
        return new RetrofitManager(baseurl);
    }

    public RetrofitManager(String baseurl) {
        this.retrofit = buildRetrofit(baseurl);
    }

    private Retrofit buildRetrofit(String baseurl) {
        Retrofit build = new Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return build;
    }

    public <T> T create(Class<T> clazz){
        return retrofit.create(clazz);
    }

}
