package com.example.zhanggang.mvprxjavaandretrofit.model;

import com.example.zhanggang.mvprxjavaandretrofit.model.bean.Data;

import io.reactivex.Observable;

/**
 * Created by zhanggang on 2017/10/9.
 */

public class RegisterModel {
    //http://gank.io/api/history/content/1/1
    public Observable<Data> register(){
        Observable<Data> observable = RetrofitManager.getDefalut().create(RetrofitApi.class).register(); //获得上游
        return observable;
    }
}
