package com.example.zhanggang.mvprxjavaandretrofit.model;

import com.example.zhanggang.mvprxjavaandretrofit.model.bean.Data;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by zhanggang on 2017/10/9.
 */

public interface RetrofitApi {
    @GET("http://gank.io/api/history/content/1/1")
    Observable<Data> register();
}
