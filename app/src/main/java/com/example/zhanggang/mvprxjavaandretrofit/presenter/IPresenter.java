package com.example.zhanggang.mvprxjavaandretrofit.presenter;

import android.content.Context;

import com.example.zhanggang.mvprxjavaandretrofit.App;
import com.example.zhanggang.mvprxjavaandretrofit.view.IView;

/**
 * Created by zhanggang on 2017/10/9.
 */

public class IPresenter<T extends IView> {
    public T view;

    public IPresenter(T view) {
        this.view = view;
        init();
    }

    public void init() {

    }
    public Context context(){
        if (view!=null&&view.content()!=null){
            return view.content();
        }
        return App.context();
    }

}
